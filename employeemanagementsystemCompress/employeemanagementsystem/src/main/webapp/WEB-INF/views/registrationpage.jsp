<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Employee Registration</title>
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Poppins:wght@200;400&display=swap"
      rel="stylesheet"
    />
    <style>
      * {
        font-family: "Poppins", sans-serif;
        box-sizing: border-box;
      }

      h3 {
        margin-left: 37%;
        font-size: 30px;
      }

      .mainForm {
        width: 50%;
        border: 1px solid #d9c0f1;
        margin-left: 25%;
        box-shadow: 2px solid black;
        background-color: #e3cdf7;
        border-radius: 5px;
      }

      .container {
        padding: 5% 10%;
      }

      .form {
        border-color: 1px solid red;
      }

      input {
        margin-bottom: 20px;
        padding: 10px;
        width: 100%;
        border: 1px solid white;
        border-radius: 5px;
      }

      input:hover {
        border: 2px solid rgb(238, 84, 84);
        transition: 0.1s ease-in;
      }

      #button {
        cursor: pointer;
        font-size: 20px;
        background-color: rgb(238, 84, 84);
        border-radius: 15px;
        margin-left: 35%;
        width: 30%;
        color: white;
        border: 2px solid rgb(238, 84, 84);
      }

      #button:hover {
        background-color: rgb(79, 79, 248);
        border: 2px solid rgb(79, 79, 248);
      }

      #gender {
        width: 12px;
      }
    </style>
  </head>

  <body>
    <h3>Employee Registration</h3>
    <div class="mainForm">
      <div class="container">
        <form action="/registration" method="get">
          <label for="first_name">First Name:</label>
          <br />
          <input type="text" name="first_name" id="first_name" />
          <br />

          <label for="last_name">Last Name:</label>
          <br />
          <input type="text" name="last_name" id="last_name" />
          <br />

          <label for="gender">Gender:</label>
          <br />
          <input type="radio" name="gender" id="gender" value="male" />Male
          <input type="radio" name="gender" id="gender" value="female" />Female
          <br />

          <label for="dob">Date of Birth:</label>
          <br />
          <input type="date" name="dob" id="dob" />
          <br />

          <label for="city">City:</label>
          <br />
          <input type="text" name="city" id="city" />
          <br />

          <label for="country">Country:</label>
          <br />
          <input type="text" name="country" id="country" />
          <br />

          <label for="pin">Pin:</label>
          <br />
          <input type="number" name="pin" id="pin" />
          <br />

          <label for="phone">Phone Number:</label>
          <br />
          <input type="tel" name="phone" id="phone" />
          <br />
          <br />

          <input type="submit" value="Submit" id="button" />
        </form>
      </div>
    </div>
  </body>
</html>
