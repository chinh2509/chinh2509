 
@if(Auth::check())
<style>

</style>
 <div class="form sign-up">
        <h1>More articles about work</h1>
        <form action="{{route('update')}}" method="post">
          @csrf
        <label> 
          <span>salary</span>
          <input style='margin-left: 50px;'class="box1" type="salary" name="salary">
        </label>
      
        <label>
          <span style="margin-left: 30px;">title</span>
          <input style="margin-left: 20px;"class="box2" type="title" name="title">
        </label>
        <br/>
        <label>
          <span>address</span>
          <input style="margin-left: 36px;"class="box3" type="address" name="address">
        </label>

        <label>
          <span style="margin-left: 30px;">form</span>
          <input style="margin-left: 14px;"class="box4" type="form" name="form">
        </label>
        <br/>
        <label>
          <span>career</span>
          <input style="margin-left: 49px;" class="box5" type="career" name="career">
        </label>
        <br/>
        <label>
          <span>description</span>
          <input style="margin-left: 14px;width: 270px;height: 100px;" class="box6" type="description" name="description">
        </label>
        <br/>
        
        <button type="submit" class="submit">Add work</button>
      </form>
 </div>
@endif