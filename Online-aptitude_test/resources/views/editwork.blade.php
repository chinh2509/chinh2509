<!-- <!DOCTYPE html>
<html>
<head>
    <title></title>
</head>
<body>

 <div class="modal fade" id="formlogin" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
               <lable>Drag and drop CV files</lable>    
        <form action="{{route('update2')}}" method="post" enctype="multipart/form-data">
            @csrf
            <div class="input-group">
            <div class="custom-file">
            <input type="file" name="image" class="custom-file-input">
            <lable class="custom-file-label">chọn file</lable>
            </div>
        </div>
        <br/>
        <div class="form-group">
        <lable>Name</lable>
            <input type="text" name="name" class="form-control" placeholder="Entername">
        </div>
        <div class="form-group">
            <lable>Number Phone</lable>
            <input type="text" name="sdt" class="form-control" placeholder="number phone">
        </div>
          <div class="form-group">
            <lable>Email</lable>
            <input type="text" name="sdt" class="form-control" placeholder="number phone">
        </div>
          <div class="form-group">
            <lable>Experience</lable>
            <input type="text" name="kinhnhiem" class="form-control" placeholder="experience">
        </div>
            <button style="margin-bottom: 10px;background-color:  #ff7543" type="submit" name="submit">Apply Now</button>
        </form>
            </div>
        </div>
    </div>
</body>
</html> -->
<!DOCTYPE html>
<html>
<head>
    <title>Connect with our company</title>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<body>
    <h1 class="text-center">stay connected with us</h1>
<div class="container">
    <form action="{{route('update2')}}" method="post" enctype="multipart/form-data">
            @csrf
            <div class="input-group">
            <div class="custom-file">
            <input type="file" name="image" class="custom-file-input">
            <lable class="custom-file-label">chọn file</lable>
            </div>
        </div>
        <br/>
        <div class="form-group">
        <lable>Name</lable>
            <input type="text" name="name" class="form-control" placeholder="Entername">
        </div>
        <div class="form-group">
            <lable>Number Phone</lable>
            <input type="text" name="sdt" class="form-control" placeholder="number phone">
        </div>
          <div class="form-group">
            <lable>Email</lable>
            <input type="text" name="sdt" class="form-control" placeholder="number phone">
        </div>
          <div class="form-group">
            <lable>Experience</lable>
            <input type="text" name="kinhnhiem" class="form-control" placeholder="experience">
        </div>
            <button style="margin-bottom: 10px;background-color:  #ff7543" type="submit" name="submit">Apply Now</button>
        </form>

    
</div>
</body>
</html>