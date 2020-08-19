
<style type="text/css">
	.bar{
		
		float:left;
	}

</style>
<div class="row">
	<h1 class="display-3">Recruitment section</h1>
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
                <p style="float: left;"><font color="orange">Nghề:{{$work->career}}</font></p>
                <p style="float: left;margin-left: 60px;" class="left"><font color="silver">
                	Chức vụ:{{$work->title}}</font></p>
                </div><br/>
                <br/>
                <div box="box2">
                <p>Tiền lương:{{$work->salary}}</p>
                
                <p>Address:{{$work->address}}</p>
                
                <h4>Miêu tả công việc:{{$work->description}}</h4> <p><button
                style="background-color: orange" class="submit" type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">Gửi CV</button></p> </div> 
                

     
        </div>
        @endforeach
    </div>
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <h4>thông tin liên hệ</h4>
                        <br/>  
        <form action="{{route('update3')}}" method="post" enctype="multipart/form-data">
            @csrf
            <input type="text" name="name" placeholder="Name">
            <input type="text" name="name_detail" placeholder="Name_detail">
            <input type="text" name="email" placeholder="email">
            <input type="text" name="kinhnhiem" placeholder="kinh nhiệm">
            <button type="submit" name="submit">gửi CV</button>
        </form>
        </div>
        </div>
    </div>

