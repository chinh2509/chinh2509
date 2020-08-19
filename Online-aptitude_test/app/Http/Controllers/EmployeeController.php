<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Employee;
use DB;
class EmployeeController extends Controller
{
    //
    public function index(){
    	return view('employee');
    }
    public function store(Request $request){
        $employee = new Employee();

        $employee->name = $request->input('name');
        $employee->email = $request->input('email');
       
        
        if ($request->hasfile('image')){
        	$file = $request->file('image');
        	$extension = $file->getClientOriginalExtension();
        	$filename = time() . '.' . $extension;
        	$file->move('uploads/employee/',$filename);
        	$employee->image = $filename;
        }else{
        	return $request;
        	$employee->image = '';
        }
        $employee->save();

        return view('Employee')->with('employee',$employee);
    }
   
    public function index4(){
        $employees = DB::table('employees')->get();
        return view('product',compact('employees'));
        // dd($users);
        // foreach ($users as $user)
        // {
        //    var_dump($user->name);
        // }
    }
    
}
