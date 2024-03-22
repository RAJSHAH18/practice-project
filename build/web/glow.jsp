<%-- 
    Document   : glow
    Created on : Sep 25, 2022, 4:44:26 PM
    Author     : RAJ SHAH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <style type="text/css">
@import url('https://fonts.googleapis.com/css2?family=Nunito:wght@900&display=swap');
*
{
    margin:0;
    padding:0;
    font-family: 'Nunito',sans-serif;

}
body
{
    display:flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh;
    background: radial-gradient(#111,#000);
}
h6
{
    position: relative;
    font-size: 80px;
    text-transform: uppercase;
    color: transparent;
    background:linear-gradient(to bottom,#222 0%,#222 50%,#111 50%,#111 100%);
    -webkit-background-clip: text;

}
h6:before
{
    
    content:attr(data-text);
    position: absolute;
    top:4px;
    left:4px;
    z-index: -1;
    background:linear-gradient(45deg,#ff0,#0f0,#f00,#00f,#0f0);
    -webkit-background-clip: text;
    color: transparent;
}
h6:after
{

    content:attr(data-text);
    position: absolute;
    top:30px;
    left:20px;
    z-index: -2;
    background:linear-gradient(45deg,#ff0,#0f0,#f00,#00f,#0f0);
    -webkit-background-clip: text;
    color: transparent;
    filter: blur(20px);
}
</style>

    </head>
    <body>
       
<h6 data-text="E-notes-save your notes">E-notes-save your notes*</h6>        
    </body>
</html>
