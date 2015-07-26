<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Fund Raising Database Management System</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<!--
Template 2060 Newspaper 
http://www.tooplate.com/view/2060-newspaper
-->
<link href="tooplate_style.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" href="nivo-slider.css" type="text/css" media="screen" />
<link rel="stylesheet" type="text/css" href="ddsmoothmenu.css" />


<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/ddsmoothmenu.js">

/***********************************************
* Smooth Navigational Menu- (c) Dynamic Drive DHTML code library (www.dynamicdrive.com)
* This notice MUST stay intact for legal use
* Visit Dynamic Drive at http://www.dynamicdrive.com/ for full source code
***********************************************/

</script>

<script type="text/javascript">

ddsmoothmenu.init({
	mainmenuid: "tooplate_menu", //menu DIV id
	orientation: 'h', //Horizontal or vertical menu: Set to "h" or "v"
	classname: 'ddsmoothmenu', //class added to menu's outer DIV
	//customtheme: ["#1c5a80", "#18374a"],
	contentsource: "markup" //"markup" or ["container_id", "path_to_menu_file"]
})


function success(update)
{
	alert("successfully donate your amount");
	
	update.submit();
	
}


</script> 


</head>

<body>

<div id="tooplate_wrapper">
	
    <div id="tooplate_header">
        
        <div id="tooplate_menu" class="ddsmoothmenu">
            <ul>
                <li><a href="Donor.jsp" class="selected">Home</a></li>
                <li><a href="index.jsp">Sign Out</a></li>
                
                
            </ul>
            <br style="clear: left" />
        </div> <!-- end of tooplate_menu -->
		<div id="site_title" style="margin-top:20px"><h4>FUND RAISING</h4></div>
    </div> <!-- END of tooplate_header -->
    
   
    
    
    <div id="tooplate_main">
    
    
     <h3>
   
    
    
      Hi,  <c:out value="${param.fname}"/>  <c:out value="${param.lname}"/>
      
     
      	  <c:set var="fname" scope="session" value= "${param.fname}"/>
    	<c:set var="lname" scope="session" value="${param.lname}"/>
    	
    	 <%@ page import="java.util.List" %>
           <%@ page import="hibernate_java_files.ManageDonor" %>
           <%@ page import="hibernate_java_files.DONOR" %>
    	
    	<%
    	
    	ManageDonor md = new ManageDonor();
    	
    	List value = md.listDonor();
    	
    	DONOR d=null;
    	
    	for(int i=0;i<value.size();i++)
    	{
    		
    		 d  = (DONOR)value.get(i);
    		
    		int donor_id = d.getDONOR_ID();
    		
    		
    	}
    	
    	
    	
    	
    	%>
   		
    

     
     </h3>
     
   <h3>  Welcome to Fund Raising  </h3>
   
   
          
        
        </div>
        
           <article>   
           
           <div>
           
           <table style="width:100%">
           
           <tr>
           

           
           <td>
           
           
           <a href='OrganizationList.jsp?fname=${fname}&lname=${lname}'><h3>List Of Organization</h3></a>
           </td>
            
           
           
           
         
           
           </tr>
           
           </table>
           
           </div>
           
           <div>
           
           
           
           </div>
           
        
         <div id="tooplate_main">
    
     <h5>Donation</h5>
    <form action="DONATIONSERVLET" method="post" name="update">
  
        <table cellpadding="3pt">
        
            <tr>
                <td>Donation Type <span class="acsentric">*</span> :</td>
                <td><select id="donationType" name="donationType" required>
  				<option value="bycard" >By Card</option>
  				<option value="bycash">By Cash</option>
  
				</select></td>
               
                
            </tr>
            <tr>
                <td>Date <span class="acsentric">*</span> :</td> 
                <td><input type="date"  name="date" size="30" required /></td>
            </tr>
            
             <tr>
                <td>Amount<span class="acsentric">*</span> :</td> 
                <td><input type="text" name="amount" size="30" required /> </td>
            </tr>
 
          
            <tr>
                <td>Organization id: <span class="acsentric">*</span> :</td>
                <td><input type="text" name="org_id" size="30" value="<%=request.getParameter("orgid")%>" required/></td>
            </tr>
            <tr>
                <td>Donor id: <span class="acsentric">*</span> :</td>
                <td><input type="text" name="donor_id" size="30" value="<%=d.getDONOR_ID()%>" required/></td>
            </tr>
             <tr>
            <td> <input type="submit" value="Submit" onclick = "success(this.update)"/></td>
            </tr>
            
                </table>
        
        <p />
        
        
        </form>   
           
        </div>   
           </article>
        
        
        
       
        <script type="text/javascript" src="js/jquery-1.4.3.min.js"></script>
		<script type="text/javascript" src="js/jquery.nivo.slider.pack.js"></script>
        <script type="text/javascript">
        $(window).load(function() {
            $('#slider').nivoSlider();
        });
        </script>
    </div>
    



<div id="tooplate_bottom_wrapper">
	<div id="tooplate_bottom">
	  <div class="cleaner"></div>
    </div> <!-- END of tooplate_bottom -->
</div> <!-- END of tooplate_bottom_wrapper -->

<div id="tooplate_footer_wrapper">
	<div id="tooplate_footer">
    	
    </div> <!-- END of tooplate_footer -->
</div> <!-- END of tooplate_footer_wrapper -->

</body>
</html>