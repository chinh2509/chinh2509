<?php

namespace App\Http\Controllers;
use Illuminate\Http\Request;
use DB;
class myController extends Controller
{
    //
    public function getInfo(Request $request){
      DB::table('product')->insert([
          'name'=>$request->username,
          'price'=>$request->price,
          'image_path'=>$request->image_path,
      ]);
       return view('home');
    }
 }