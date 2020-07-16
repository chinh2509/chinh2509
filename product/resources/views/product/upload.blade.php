@extends('layour')

@section('main')
    <div class="gallery-upload">
        <h2>Upload</h2>
        <!-- <form action="{{route('product.store')}}" method="post" enctype="multipart/form-data">
            @csrf
            <input type="text" name="name" placeholder="Name">
            <input type="text" name="price" placeholder="Price">
            <input type="file" name="image">
            <button type="submit" name="submit">add</button>
        </form>
 -->   
<form action="{{route('product.store')}}" method="post" enctype="multipart/form-data">
        @csrf
      <label>
        <span>name</span>
        <input type="text" name="name" placeholder="Name">
      </label>
      <label>
        <span>price</span>
        <input type="text" name="price" placeholder="Price">
      </label>
      <label>
        <span>image</span>
        <input type="file" name="image">
      </label>
      <button type="submit" class="submit">add</button>
    </form>
  </div>
@endsection
