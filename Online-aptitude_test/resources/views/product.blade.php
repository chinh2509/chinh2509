@if(Auth::check())
<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<style type="text/css">
.slider3{
    width: 100%;
    height: 960px;
    float: left;
    margin-top: 100px;
}
.slider3 .topinsector2{
    width: 140px;
    height: 30px;
    border: none;
    background-color: black;
    color: white;

}
#banner{
    font-size: 30px;
    text-align: center;
}
#button{
    margin-left: 655px;
}
.w1{
    width:75%;
    height: 370px;
    margin: 0 auto;
}
.w1 .box1{
    width: 31%;
    height: 95%;
    float: left;
    margin-right: 25px;
}
.w1 .box1 i{
    font-size:50px;
    margin-left: 10px;
    margin-top: 10px;
    float: left;
    color: orangered;

}
.w1 .box1 .rside{
    width: 73%;
    height: 50px;
    float: left;
    margin-left: 20px;
}
h2:hover{
    color:#ff7543;
}
p{
    color: #6d6a6a;
}


	</style>
<div class="container">
    <div class="slider3">
    <div id="button">
    <button class="topinsector2">TOP IN SECTOR</button>
    </div>
    <p id="banner">Strategic <strong>Services</strong></p>
    <div class="w1">
    	 @csrf
    	@foreach($employees as $employee)
        <div class="box1">
            <img src="uploads/employee/{{$employee->image}}"width="325" height="235" alt="img">
            <i class="fas fa-hard-hat"></i>
            <div class="rside">
            <h2>{{$employee->name}}</h2>
            <p>{{$employee->email}}</p>
            </div>
        </div>
         @endforeach
        
    </div>
    
</div>
</div>
</body>
</html>
@endif