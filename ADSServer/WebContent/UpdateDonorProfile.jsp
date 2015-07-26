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
      
     
      	
   		
    

     
     </h3>
     
   <h3>  Welcome to Fund Raising  </h3>
   
   
          
        
        </div>
        
           <article>   
           
           <div>
           
           <table style="width:100%">
           
           <tr>
           

           
           <td>
           
           
           <a href='OrganizationList.jsp?fname=${fname}&lname=${lname}'><h3>List Of Organizations</h3></a>
           </td>
           </tr>
           
           </table>
           
           </div>
           
           <div>
           
           
           
           </div>
           
        
         <div id="tooplate_main">
    
     <h5>Update Profile</h5>
    
    <form action="Update_servlet" method="post">
    <input type="hidden" name="donorid" id="userId" value="${param.donorid}" />
    <input type="hidden" name="oldUserId" id="userId" value="${param.userid}" />
    <input type="hidden" name="indexid" id="indexid" value="${param.indexid}" />
        <table cellpadding="3pt">
        
            <tr>
                <td>User ID <span class="acsentric">*</span> :</td>
                <td><input type="text" name="userId" size="30" value="${param.userid}" required /></td>
            </tr>
            <tr>
                <td>Password <span class="acsentric">*</span> :</td> 
                <td><input type="password" id="password" name="password" size="30" value="${param.password}" required /></td>
            </tr>
            
             <tr>
                <td>Re-enter Password <span class="acsentric">*</span> :</td> 
                <td><input type="password"  id="repassword" name="Repassword" value="${param.repassword}" size="30" required /> <span id="error">password does not match</span></td>
            </tr>
 
          
            <tr>
                <td>Email <span class="acsentric">*</span> :</td>
                <td><input type="email" name="email" size="30" value="${param.email}" required/></td>
            </tr>
            <tr>
                <td>Fname <span class="acsentric">*</span> :</td>
                <td><input type="text" name="fname" size="30" value="${param.fname}"  required/></td>
            </tr>
            <tr>
                <td>Lname <span class="acsentric">*</span> :</td>
                <td><input type="text" name="lname" size="30" value="${param.lname}" required /></td>
            </tr>
        	<tr>
        	
        	<td>Donor Address <span class="acsentric">*</span> :</td>
        	<td>
        	<textarea rows="4" cols="20" name="address" vertical-align="top">
			 <c:out value="${param.address}"/> 
			</textarea>
        	
        	</td>
        	
        	</tr>
        	
        	<tr>
                <td>Date_Of_birth <span class="acsentric">*</span> :</td>
                <td><input type="date" name="date" size="30" value="${param.dob}" placeholder="Date Of Birth" required /></td>
            </tr>
            
            <tr>
                <td>Age <span class="acsentric">*</span> :</td>
                <td><input type="number" name="age" size="30" value="${param.age}" placeholder="Age" required /></td>
            </tr>
            
            <tr>
                <td>Phone <span class="acsentric">*</span> :</td>
                <td><input type="tel" name="phone" size="30" value="${param.phone}" placeholder="Contact-Number" required /></td>
            </tr>
            
            <tr>
        	
        	<td>Donor Details <span class="acsentric">*</span> :</td>
        	<td>
        	<textarea rows="4" cols="20" name="details">
			 <c:out value="${param.details}"/> 
			</textarea>
        	
        	</td>
        	
        	</tr>
            
            
            <tr>
            <td> <input type="submit" value="Submit" /></td>
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