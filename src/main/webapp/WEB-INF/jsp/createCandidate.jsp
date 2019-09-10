<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Candidate</title>
</head>
<body>
 <form:form action="saveCandidate" method="post" modelAttribute="candidate"> 
      <table> 
        <tr> <td colspan = "3">Candidate Information </td> 
        <tr><td >Name:</td>
          <td>
            <form:input type="text" path="name" required="required"></form:input>
          </td>
        </tr>  
        <tr><td>Phone Number:</td>
          <td>
          <form:input type ="text" path="phoneNo"/>
          </td>
        </tr>
        <tr><td>Email Id:</td>
          <td>
          <form:input type ="email" path="emailId"/>
          </td>
        </tr>
        <tr><td>Position:</td>
          <td>
          <form:input type ="text" path="position"/>
          </td>
        </tr>
        <tr><td>Experience:</td>
          <td>
          <form:input type ="text" path="experience"/>
          </td>
        </tr>
        <tr>
          <td>
          <input type ="submit" value="Save"/>
          </td>
        </tr>
       </table>
  </form:form>
</body>
</html>