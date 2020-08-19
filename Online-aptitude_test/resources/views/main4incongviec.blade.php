@if(Auth::check())
<style type="text/css">
    .bar{
        
        float:left;
    }
    .input{
        width: 260px;
    }
</style>
<div class="row">
    <h1 class="display-3" style="    margin-left: 14px;">Recruitment section</h1>
        <div class="col-xs-12">
            
             @foreach($works as $work)
            <div style="border: 1px solid silver;padding-top: 15px;" class="col-md-4 bar">
         
         
                 
                <div class="box"> 
                <!-- <thead>
                   {{ csrf_field() }}
                <tr>
                    @csrf
                    <td>tiền lương</td>
                    <td>chức vụ</td>
                    <td>địa chỉ</td>
                    <td>thời gian làm</td>
                    <td>nghề</td>
                    <td>miêu tả</td>    
                </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>{{$work->salary}}</td>
                        <td>{{$work->title}}</td>
                        <td>{{$work->address}}</td>
                        <td>{{$work->form}}</td>
                        <td>{{$work->career}}</td>
                        <td>{{$work->description}}</td>


                        <td><button type="submit" class="submit">Gửi CV</button></td>
                    </tr>
                    
                </tbody> -->
                {{ csrf_field() }}
                <p style="float: left;font-size: 20px"><font color="#ff6832">Job:{{$work->career}}</font></p>
                <p style="float: left;margin-left: 60px;margin-top: -47px;" class="left"><font color="silver">
                    Title:{{$work->title}}</font></p>
                </div><br/>
                <br/>
                <div box="box2">
                <p>Salary:{{$work->salary}}</p>
                
                <p>Address:{{$work->address}}</p>
                
                <h4 style="font-size: 25px;margin-top: 10px;">Description:{{$work->description}}</h4>
                </div> 
                <button style="background-color:  #fa9570 ;margin-bottom:15px;" data-toggle="modal" data-target="#formlogin"><a style="text-decoration: none;color: black;" href="work/applywork">Apply Now</a></button>
               <!-- <a href="#" data-toggle="modal" data-target="#formlogin">đăng nhập</a> -->
        </div>
        @endforeach
    </div>
    </div>
    <div class="modal fade" id="formlogin" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
               <lable>Stay connected with us</lable>    
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
    
    
@endif

