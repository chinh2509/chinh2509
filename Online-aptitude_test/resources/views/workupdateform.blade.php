<!DOCTYPE html>
<html>
<head>
	<title>update work</title>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<body>
	<h1 class="text-center">Connect with our company</h1>
<div class="container">
	<form action="{{route('post-edit',$work->id)}}" method="POST" enctype="multipart/form-data">
		{{csrf_field()}}
		<lable>id</lable>
		<input type="text" name="id" class="form-control" value="{{$work->id}}">
		<div class="form-group">
            <lable>salary</lable>
            <input type="text" name="salary" class="form-control" placeholder="Entername" value="{{$work->salary}}">
		</div>
		<div class="form-group">
            <lable>Title</lable>
            <input type="text" name="title" class="form-control" placeholder="Entername" value="{{$work->title}}">
		</div>
		<div class="form-group">
            <lable>Address</lable>
            <input type="text" name="address" class="form-control" placeholder="Entername" value="{{$work->address}}">
		</div>
		<div class="form-group">
            <lable>Form</lable>
            <input type="text" name="form" class="form-control" placeholder="Entername" value="{{$work->form}}">
		</div>
		<div class="form-group">
            <lable>Career</lable>
            <input type="text" name="career" class="form-control" placeholder="Entername" value="{{$work->career}}">
		</div>
		<div class="form-group">
            <lable>Description</lable>
            <input type="text" name="description" class="form-control" placeholder="Entername" value="{{$work->description}}">
		</div>
		<button type="submit" name="submit" class="btn btn-primary br-lg">Upload work</button>	
	</form>

	
</div>
</body>
</html>