<?php

use Illuminate\Support\Facades\Route;
/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});
Route::get('/login', function () {
    return view('login-logout/login');
});
Route::post('getInfo', 'mycontroller@getInfo')->name('getInfo');
Route::post('getLogin', 'mycontroller@getLogin')->name('getLogin');
Route::get('logout', 'mycontroller@logout')->name('logout');
Route::get('/employer', function () {
    return view('demoAdmin/employer');
});
Route::get('/application', function () {
    return view('demoAdmin/application');
});
//employee//
Route::get('product','EmployeeController@index4');
//---------------------------------------------------//
Route::get('index', 'mycontroller@index');
Route::get('application', 'mycontroller@application');
Route::get('employer', 'mycontroller@index3');

Route::post('update', 'mycontroller@update')->name('update');
Route::post('update2', 'mycontroller@update2')->name('update2');

/////////////////////////////////////////////////////////////////
Route::get('store_image','StoreImageController@index');
Route::post('store_image/insert_image','StoreImageController@insert_image');
Route::get('store_image/fetch_image/{id}','StoreImageController@fetch_image');


////////////////////////////////////////////////////////////////

Route::get('/employee','EmployeeController@index');
Route::post('/employee','EmployeeController@store')->name('addimage');
///sửa xóa//
Route::get('/editimage/{id}','mycontroller@edit')->name('editimage');

Route::post('/editimage/{id}','mycontroller@postEdit')->name('post-edit');
Route::get('delete/{id}','mycontroller@delete')->name('deletework');

/////////////////////////////////////////
Route::get('/HOME', function () {
    return view('Home/home');
});


Route::get('/HOME/career', function () {
    return view('Home/career');
});
Route::get('/HOME/career','mycontroller@index4');
Route::get('/HOME/aboutcompany', function () {
    return view('Home/aboutcompany');
});
Route::get('/HOME/blogdetail', function () {
    return view('Home/blogdetail');
});
Route::get('/HOME/joblist', function () {
    return view('Home/joblist');
});
Route::get('/HOME/contactus', function () {
    return view('Home/contactus');
});
Route::get('/HOME/project', function () {
    return view('Home/project');
});
Route::get('HOME/work/applywork', function () {
    return view('editwork');
});