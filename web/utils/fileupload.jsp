<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page import="wjhk.jupload2.JUploadApplet" %>
<html>
<head>
    <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>Importar archivos</title>
  <meta name="description" content="Plupload example using the java runtime for uploads." />  
  <link rel="stylesheet" href="css2/style.css?v=3" />
  <link rel="stylesheet" href="css2/960.css?v=3" />
  <link rel="stylesheet" href="css2/custom.css?v=4" />
  
<script src="//ajax.googleapis.com/ajax/libs/dojo/1.6/dojo/dojo.xd.js"></script>
<link rel="stylesheet" href="css/jquery.plupload.queue.css" />

  <script src="js2/modernizr-1.5.min.js"></script>
  
<s:head />
<style type="text/css">
@import url(style.css);
</style>
</head>
<%@ include file="../main.jsp" %>

<body class="container_12">
<div class="grid_12">
  <div>
    <h1>Importar archivos de Conceptos de Opus</h1>
    <div id="java_uploader" style="width: 450px; height: 330px;margin:20px"></div>
  </div>
</div>
<script src="js/moxie.js"></script>
<script src="js2/plupload.js"></script>
<script src="js2/applet.js"></script>
<script src="js2/plupload.java.js"></script>
<script src="js2/dojo.plupload.queue.js"></script>
<script>
mOxie.Mime.addMimeType("application/database,dbf cdx fpt");
dojo.ready(function() {
  if(!applet.hasVersion('1.5')){
    var style = ['background-color: #FDD',
                 'font-weight:bold',
                 'position:fixed',
                 'top:0px',
                 'width:100%',
                 'text-align:center',
                 'z-index:1000',
                 'left:0px',
                 'height:30px'].join(';');
    var warning = dojo.create('div', { style:style, innerHTML: 'Java is not present, please enable or download <a href="' + applet.java_url + '">here</a>'}, dojo.body());
  }


  dojo.query("#java_uploader").pluploadQueue({
    runtimes : 'java',    
    url : 'Upload.do',
    chunk_size : '50mb',
    java_applet_url: 'plugins/plupload.java.jar?v=1',
    loader_url: 'utils/loader.gif',
    log_level:1,    
    filters:[
        {title: "Archivos de Opus", extensions: "dbf"}
    ]
  });
});
</script>

  </div>

  

  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
  <script>!window.jQuery && document.write('<script src="js2/jquery-1.4.2.min.js"><\/script>')</script>

  <script src="js2/superfish.js"></script>

  <!--[if lt IE 7 ]>
    <script src="js2/dd_belatedpng.js?"></script>
    <script>
      DD_belatedPNG.fix('img, .png_bg');
    </script>
  <![endif]-->

  <script src="js2/util.js"></script>
  <script src="js2/jquery.html5form-1.2.js"></script>
  

  


</body>
</html>