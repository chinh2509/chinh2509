<div class="row">
        <div class="col-sm-12">
            <h1 class="display-3">select sp</h1>
            <div>
                <a href="" class="btn btn-primary">thêm sản phẩm</a>
            </div>
            <div class="flex-center position-ref full-height">
            </div>
            <table class="table table-striped">
                <thead>
                <tr>
                 
                    <td>name</td>   
                    <td>email</td>
                    <td>phone</td>
                </tr>
                </thead>
                <tbody>
                @foreach($users as $user)
                    <tr>
                        <td>{{$user->name}}</td>
                        <td>{{$user->email}}</td>
                        <td>{{$user->phone}}</td>
                        <td>
                            <a href="#" class="btn btn-primary">Edit</a>
                        </td>
                    </tr>
                @endforeach
                </tbody>
            </table>
        </div>
    </div>