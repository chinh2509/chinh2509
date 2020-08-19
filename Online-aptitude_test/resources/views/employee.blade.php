@if(Auth::check())
<!DOCTYPE html>
<html>
<head>
	<title>test update ảnh 2</title>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<body>
	<h1>Upload Image</h1>
<div class="container">
	<form action="{{route('addimage')}}" method="POST" enctype="multipart/form-data">
		{{csrf_field()}}
		<div class="form-group">
            <lable>Name</lable>
            <input type="text" name="name" class="form-control" placeholder="Entername">
		</div>
		<div class="form-group">
            <lable>nam detail</lable>
            <input type="text" name="email" class="form-control" placeholder="Enter detail">
		</div>
		<div class="input-group">
            <div class="custom-file">
            <input type="file" name="image" class="custom-file-input">
            <lable class="custom-file-label">chọn file</lable>
            </div>
		</div>
		<button type="submit" name="submit" class="btn btn-primary br-lg">Save product</button>	
	</form>

	
</div>
</body>
</html>
@endif