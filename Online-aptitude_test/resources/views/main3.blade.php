
@if(Auth::check())
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
                <p style="float: left;"><font color="orange">Job:{{$work->career}}</font></p>
                <p style="float: left;margin-left: 60px;" class="left"><font color="silver">
                	Position:{{$work->title}}</font></p>
                </div><br/>
                <br/>
                <div box="box2">
                <p>Salary:{{$work->salary}}</p>
                
                <p>Address:{{$work->address}}</p>
                
                <h4>Description:{{$work->description}}</h4>
                </div> 
                <a href="/editimage/{{$work->id}}" style="background-color:  #fa9570;margin-bottom: 15px;" class="btn btn-success">EDIT</a>
                <a href="/delete/{{$work->id}}" style="background-color:  #fa9570;margin-bottom: 15px;" class="btn btn-success">xóa</a>
     
        </div>
        @endforeach
    </div>
@endif
