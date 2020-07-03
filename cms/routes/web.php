<?php

use Illuminate\Support\Facades\Route;
use App\Port;
use App\Task;
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
Route::get('/home','Controller@homeController');

Route::get('/home2','Controller@showWelcome');

Route::get('/aboutController','Controller@homeController2');

Route::get('about/{theSubject3}','Controller@showSubject');

Route::get('/', function () {
    return view('welcome');
});
Route::get('quanli	',function () {
    return ('triệu cao chinh');
});  
Route::get('quanli/khachhang',function () {
    return view ('hello');    
});
Route::get('/quanli/{theSubject}', function ($theSubject) {
    return $theSubject . 'ket noi ok';
});
Route::get('/test/{theSubject}/{theSubject2}', function ($theSubject,$theSubject2) {
    return $theSubject .' '. 'ket noi ok' .' '. $theSubject2 . ' ahihi';
});
Route::get('where',function(){
    return Redirect::to('abount/directions');
});
///-------------------------------------------WEB 1------------------------------------------------------///

Route::get('profile/{fullname}','Controller@showProfile')->name('profile');

Route::get('/HOME',function () {
    return view ('HOME');    
});
Route::get('/blog',function () {
    return view ('blog');    
});
Route::get('/contact',function () {
    return view ('contact');    
});
Route::get('/petmart',function () {
    return view ('petmart');    
});
Route::get('/about',function () {
    return view ('about');    
});
Route::get('/pethuide',function () {
    return view ('pethuide');    
});
///---((-------------------------------------------------------WEB2//
//insert db
Route::get('/insert',function() {
    DB::insert('insert into ports(id,title,body,is_admin) value(?,?,?,?)',[12,'PHP LAVARVEL','LAVARVEL  is the best']);
});
//in ra db
Route::get('/read',function () {
    $result = DB::select('select * from ports where id > ?',[1]);  
    //return $result;
    foreach ($result as $post){
    	return $post->body;
    }
});
//cap nhat db
Route::get('update',function () {
	$updated = DB::update('update ports set title = "New title" where id > ?',[1]);
    return $updated;    
});
//delete db
Route::get('delete',function(){
	$delete = DB::delete('delete from ports where id = ?',[3]);
	return $delete;
});

//--------------------------------------------------ORM-----------------------------------------------//
Route::get('readALL',function(){
	$ports = port::all();
	foreach ($ports as $p) {
		echo $p->title . " " .$p->body;
		echo "<br>";
	}
});	
Route::get('findid',function(){
	//$ports = port::where('id',2)
	$ports = port::where('id','>=',1)
	->where('title','welcome home for me')
	->where('body','like','%big%')
	->orderBy('id','desc')
	->take (2)
	->get();
	foreach ($ports as $p) {
		echo $p->title . " " .$p->body;
		echo "<br>";
	}
});	
//insert//
Route::get('insertORM',function(){
	$p = new Port;
	$p->title = 'insert ORM';
	$p->body = 'body insert ORM';	
	$p->is_admin = 1;
	$p->save();
});
//update//
Route::get('updateORM',function(){
	//$p = Port::find(2);
	$p = Port::where('id',4)->first();
	$p->title = 'update ORM';
	$p->body = 'body update ORM';
	$p->save();
});
//delete ban ghi//
//c1:
Route::get('deleteORM',function(){
	Port::where('id','>=',20)
	->delete();
});
//c2:
Route::get('destroyORM',function(){
	Port::destroy([10,15]);

});
///-----------------------------------(TRANG CHU TASK)---------------------------///
//--hiển thị dữ liệu db--///
Route::get('DEMOcuaCO',function(){
	$tasks = Task::orderBy('created_at','desc')->get();

   return view('tasks',[
        'tasks' => $tasks
   ]);
});
//--báo lỗi and insert db-/-/
Route::post('/task',function(Request $request){
   //validate information
	$validate = validator::make($request->all(),['name' => 'required|max:225']);
	if ($validator->fails()){
		return redirect('/')
		   ->withInput()
           ->withErrors($validator);   
	}
	$task = new Task;
	$task->name = $request->name;
	$task->save();

	return readirect();
});
//--delete task--//
Route::delete('/task/{task}' ,function($id){
    Task::findOrFail($id)->delete();
    return redirect("/DEMOcuaCO");
});