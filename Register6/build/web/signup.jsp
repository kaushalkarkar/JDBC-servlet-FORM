<%-- 
    Document   : signup
    Created on : 25-Jan-2022, 6:17:57 pm
    Author     : KAUSHAL KARKAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
         <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
     <title>JSP Page</title>
    </head>
    <body style="background: orange">
        <div class=""container>
            <div class="row">
                <div class="col m6 offset-m3">
                    <div class="card">
                        <div class="card-content">
                            <h3>Register here</h3>
                                <form action="Register" method="post">
                            <div class="form center-align">
                                <input type="text" name="user_firstname" placeholder="Enter your firstname"/>
                                <input type="text" name="user_lastname" placeholder="Enter your lastname"/>
                                <input type="text" name="user_enrollment" placeholder="Enter your enrollment"/>
                                <input type="text" name="user_contactnumber" placeholder="Enter your contactnumber"/>
                                <input type="text" name="user_semester" placeholder="Enter your semester"/>
                                <button type="submit" class="btn">submit here</button>
                                
                            </div>
                            <div class="loader" style="display: none">
                            
                            <div class="progress">
                     <div class="indeterminate"></div>
                      </div>
                                <h6>please wait......</h6>
                        </div>
                    </div>
            </div>
        </div>
                
                
     <script
  src="https://code.jquery.com/jquery-3.6.0.min.js"
  integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
   
  crossorigin="anonymous">
   </script>
})
  <script>
      $(document).ready(function(){
     console.log("page is ready")
            
  </script>
    </body>
</html>
