<?php

namespace App\Http\Controllers;
use Illuminate\Http\Request;
use App\Employee;
use App\work;
use DB;
use Auth;
class mycontroller extends Controller
{
    //
    public function index(){
        $users = DB::table('users')->get();$works = DB::table('work')->get();
        return view('demoAdmin/index',compact('users','works'));
        // dd($users);
        // foreach ($users as $user)
        // {
        //    var_dump($user->name);
        // }
    }
    public function select(){
        $ungvien = DB::table('ungvien')->get();
        return view('demoAdmin/employee',compact('ungvien'));
        // dd($users);
        // foreach ($users as $user)
        // {
        //    var_dump($user->name);
        // }
    }
    public function index4(){
        $users = DB::table('users')->get();$works = DB::table('work')->get();
        return view('Home/career',compact('users','works'));
        // dd($users);
        // foreach ($users as $user)
        // {
        //    var_dump($user->name);
        // }
    }

    public function application(){
        $users = DB::table('users')->get();$works = DB::table('work')->get();
        return view('demoAdmin/application',compact('users','works'));
        // dd($users);
        // foreach ($users as $user)
        // {
        //    var_dump($user->name);
        // }
    }
    public function index3(){
        $works = DB::table('work')->get();
        return view('demoAdmin/employer',compact('works'));
        // dd($users);
        // foreach ($users as $user)
        // {
        //    var_dump($user->name);
        // }
    }

    public function getInfo(Request $request){
    	DB::table('users')->insert([
           'name'=>$request->username,
           'email'=>$request->email,
          
           'password'=>bcrypt($request->password),
    	]);
    	 return view('demoAdmin/index');
    }
    public function update2(Request $request){
        
         return redirect('index');
    }
    public function update(Request $request){
        DB::table('work')->insert([
          'salary'=>$request->salary,
          'title'=>$request->title,
          'address'=>$request->address,
          'form'=>$request->form,
          'career'=>$request->career,
          'description'=>$request->description
   
        ]);
         return redirect('index');
    }
    public function getLogin(Request $request){
    	// dd(bcrypt(123456));
        $name['info'] = $request->name;
    	$email  = $request->email;
    	$pass = $request->password;
    	// $result = DB::table('member')->where('email',$email)->get()->toArray();

    	// foreach ($result as $value) {

 	    // }
    	// if($value->password == $pass){
    	// 	echo"đăng nhập thành công";

    	// }else{
    	// 	echo "đăng nhập sai";
    	
    	// }   
    	if(Auth::attempt(['email'=>$request->email,'password'=>$request->password])){
    		return redirect('index');
    	}else{
    	    echo"<p>đăng nhập lại<p>";
    		return view('login-logout/login');
    	}
    }

    public function logout(){
    	Auth::logout();
    	return view('Login');
    }
/////////////////////////////
    public function edit($id){
      $work = work::find($id);
      return view('workupdateform')->with('work',$work);
    }


    public function postEdit(Request $request,$id){
      $work = work::find($id);
      
  
          $work->salary = $request->get('salary');
          $work->title = $request->get('title');
          $work->address = $request->get('address');
          $work->form = $request->get('form');
          $work->career = $request->get('career');
          $work->description = $request->get('description');

      $work->save();
      // dd($work);
      return redirect('index'); 
  
    }
    public function delete($id){
        work::find($id)->delete();
        return redirect()->back()->withSuccess('record deleted successfully');
    }

}

