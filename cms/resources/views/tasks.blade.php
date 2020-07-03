<!-- thừa kế từ app.blade.php -->
@extends ('layouts.app')
<!-- nội dung trang con
dung app.css -->
@section('content')
  <!-- định nghĩa nội dung trang task -->
  <div class="panenl-body">
  	<!-- hiển thị thông tin báo lỗi -->
  	@include('errors.503')
<!-- form nhập task mới -->
  	<from action="{{url('task')}}" method="post" class="from-horizontal">
           	{{csrf_field()}}
           <!-- 	tên task -->
           	<div class="from-group">
           		<lable for="task" class="col-sm-3 control-layble">
           			task
           		</lable>
                <div class="col-ms-6">
                	<input type="text" name="name" id="task-name" class="form-control">
                </div>	
           	</div>

           <!-- 	nút task -->
           <div class="from-group">
           	  <div class="col-sm-offset-3 col-sm-6">
           	  	<button type="submit" class="btn btn-default">
           	  		<i class="fa fa-plus"></i>Add Task
           	  	</button>
           	  </div>
           </div>
  	</from>	
  	<!-- hien thi noi  dung co trong database -->
  	@if(count($tasks)>0)
  	    <div class="panel panel-default">
  	    	<div class="panel-heading">
  	    		Current Task
  	    	</div>
  	    	<div class="panenl-body">
  	    		<table class="table table-striped task-table">
  	    			<!-- tao tieu de --> 
  	    			<thead>
  	    				<td>task</td>
  	    				<td>&nbsp</td>
  	    			</thead>
  	    			<!-- hien thi noi dung	 -->
  	    			<tbody>
  	    				@foreach($tasks as $task)
  	    				<tr>
  	    					<td class="table-text">
  	    						<div>{{$task=name}}</div>
  	    					</td>
  	    					<td>
  	    						<form action="/task/{{$task->id}}" method="post">
  	    							{{csrf_field()}}
  	    							{{methob_field('delete')}}
  	    							<button>Delete task</button>
  	    							<input type="hinden" name="methob" value="delete">
  	    						</form>
  	    					</td>
  	    				</tr>
  	    				@endforeach
  	    			</tbody>		

  	    		</table>
  	    	</div>
  	    </div>
  	    @endif
  </div>
  @endsection

  
