
@if(Auth::check())
<div class="row">
        <div class="col-sm-12">
            <h1 class="display-3">Candidate list</h1>
            
            <div class="flex-center position-ref full-height">
            </div>
            <table class="table table-striped">
                <thead>
                   {{ csrf_field() }}
                <tr>
                    @csrf
                    <td>name</td>   
                    <td>email</td>
                
                </tr>
                </thead>
                <tbody>
                @foreach($users as $user)
                    <tr>
                        <td>{{$user->name}}</td>
                        <td>{{$user->email}}</td>
                       
                    </tr>
                @endforeach
                </tbody>
            </table>
        </div>
    </div>
@endif