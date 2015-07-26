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

	//var fname="snehit",lname="gajjar";
	function updateDonor(){
		
		<%  // String fname  = request.getAttribute("FNAME").toString();
	     
	  //   String lname = request.getAttribute("LNAME").toString(); 
	     
	     %>
	
}

</script> 


</head>

<body>

<div id="tooplate_wrapper">
	
    <div id="tooplate_header">
        
        <div id="tooplate_menu" class="ddsmoothmenu">
            <ul>
                <li><a href="Organization.jsp" class="selected">Home</a></li>
                <li><a href="index.jsp">Sign Out</a></li>
                
                
            </ul>
            <br style="clear: left" />
        </div> <!-- end of tooplate_menu -->
		<div id="site_title" style="margin-top:20px"><h4>FUND RAISING</h4></div>
    </div> <!-- END of tooplate_header -->
    
   
    
    
    <div id="tooplate_main">
    
    
     
     
     <h3>
    	
    	 <c:set var="email" scope="session" value= "${requestScope.EMAIL}"/>
     <c:set var="indexid" scope="session" value= "${requestScope.INDEXID}"/>
      <c:set var="userid" scope="session" value= "${requestScope.USERID}"/>
    	<c:set var="fname" scope="session" value= "${requestScope.FNAME}"/>
    	<c:set var="lname" scope="session" value="${requestScope.LNAME}"/>
    	<c:set var="noofemp" scope="session" value="${requestScope.NOE}"/>
    	<c:set var="website" scope="session" value="${requestScope.WEBSITE}"/>
    	<c:set var="status" scope="session" value="${requestScope.STATUS}"/>
    	<c:set var="goals" scope="session" value="${requestScope.GOALS}"/>
    	<c:set var="details" scope="session" value="${requestScope.DETAILS}"/>
    	<c:set var="phone" scope="session" value="${requestScope.PHONE}"/>
    	<c:set var="address" scope="session" value="${requestScope.ADDRESS}"/>
    	<c:set var="password" scope="session" value="${requestScope.PASSWORD}"/>
    	<c:set var="repassword" scope="session" value="${requestScope.REPASSWORD}"/>
    	<c:set var="type" scope="session" value="${requestScope.TYPE}"/>
    	<c:set var="orgid" scope="session" value="${requestScope.ORGID}"/>
    	
      Hi, <c:out value="${fname}"/> <c:out value="${lname}"/> 
   		
    

     
     </h3>
     
   <h3>  Welcome to Fund Raising  </h3>
   
   
   
   	 <%@ page import="java.util.List" %>
           <%@ page import="hibernate_java_files.ManageOrganization" %>
           <%@ page import="hibernate_java_files.ORGANIZATION" %>
   
  <%--  <%=request.getAttribute("USERID").toString()%> --%>
  
     
        
        </div>
        
           <article>   
           
           <div>
           
           <table style="width:100%">
           
           <tr>
           
           <td>
       
    		
		
           <a href='UpdateOrganizationProfile.jsp?orgid=${orgid}&type=${type}&repassword=${repassword}&password=${password}&address=${address}&phone=${phone}&details=${details}&goals=${goals}&status=${status}&website=${website}&noofemp=${noofemp}&fname=${fname}&lname=${lname}&email=${email}&userid=${userid}&indexid=${indexid}'><h3>Update Profile</h3></a>
           
           </td>
           
           <td>
           
           
           <a href='DonorList.jsp?orgid=${orgid}&type=${type}&repassword=${repassword}&password=${password}&address=${address}&phone=${phone}&details=${details}&goals=${goals}&status=${status}&website=${website}&noofemp=${noofemp}&fname=${fname}&lname=${lname}&email=${email}&userid=${userid}&indexid=${indexid}'><h3>List Of Donor</h3></a>
           </td>
            <td>
           
           
           <a href='Event.jsp?orgid=${orgid}&type=${type}&repassword=${repassword}&password=${password}&address=${address}&phone=${phone}&details=${details}&goals=${goals}&status=${status}&website=${website}&noofemp=${noofemp}&fname=${fname}&lname=${lname}&email=${email}&userid=${userid}&indexid=${indexid}x'><h3>Event</h3></a>
           
       
           </td>
           
            <td>
           
           
           <a href='Project.jsp?orgid=${orgid}&fname=${fname}&lname=${lname}' ><h3>Projects</h3></a>
           
           
           </td>
             <td>
           
           
           <a href='Expense.jsp?orgid=${orgid}&fname=${fname}&lname=${lname}' ><h3>Expenses</h3></a>
           
           
           </td>
             <td>
           
           
           <a href='Fund.jsp?orgid=${orgid}&fname=${fname}&lname=${lname}' ><h3>Fund</h3></a>
           
           
           </td>
           </tr>
           
           </table>
           
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