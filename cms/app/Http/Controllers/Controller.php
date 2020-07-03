<?php

namespace App\Http\Controllers;

use Illuminate\Foundation\Auth\Access\AuthorizesRequests;
use Illuminate\Foundation\Bus\DispatchesJobs;
use Illuminate\Foundation\Validation\ValidatesRequests;
use Illuminate\Routing\Controller as BaseController;

class Controller extends BaseController
{
    use AuthorizesRequests, DispatchesJobs, ValidatesRequests;

    public function homeController(){
    	return 'hello everybody';
    }

    public function homeController2(){
    	return 'hello everybody2';
    }
    
    public function showSubject($theSubject3){
    	return "xin chao $theSubject3";
    }

    public function showWelcome(){
    	return view ('hello');    
    }

    public function showProfile($fullname){
    	return view ('profile')->with('fullname',$fullname);    
    }
}
