<!DOCTYPE html>
<html lang="en">
   <head>
      <title>DEMO CỦA CÔ</title>
   
   <style type="text/css">
   	html,body {
   		height: 100%;
   	}
   	body{
   		margin: 0;
   		padding: 0;
   		width: 100%;
   		color:#B0BEC5;
   		display: table;
   		font-weight: 100;
   		font-family: 'lato',san-serif;
   	}
   	.container{
   		text-align: center;
   		display: table-cell;
   		vertical-align: middle;
   	}
   	.content{
   		text-align: center;
   		display: inline-block;	
   	}
   	.title {
   		font-size: 72px;
   		margin-bottom: 40px;
   	}
   </style>
   </head>
   <body>
       <div class="container">
            <div class="content">
            	<div class="title">BE right back</div>
                @if(count($errors)>0)
                  <!-- thong bao loi -->
                  <div class="alert alert-danger">
                  	<strong>co loi roi</strong>
                  	<br><br>
                  	<ul>
                  		@foreach($errors->all() as $error)
                  		   <li>(@errors)</li>
                  		@endforeach;
                  	</ul>
                  </div>	
                @endif;  
                  
            </div>
       </div>  
   </body>   
</html>	