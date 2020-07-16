<!DOCTYPE html>
<html>
<head>
   <title>How to Design Login & Registration Form Transition</title>
   <meta charset="UTF-8">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" type="text/css" href="css/style.css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:400,600,700,800&display=swap" rel="stylesheet">
</head>
<body>
  <div class="cont">
    

    <div class="sub-cont">
    
        <div class="img-text m-in">
          <h2>One of us?</h2>
          <p>If you already has an account, just sign in. We've missed you!</p>
        </div>
    

      <div class="form sign-up">
        <h2>Sign Up</h2>
        <form action="{{route('getInfo')}}" method="post">
          @csrf
        <label> 
          <span>Name</span>
          <input type="username" name="username">
        </label>
        <label>
          <span>price</span>
          <input type="price" name="price">
        </label>
        <label>
          <span>image path</span>
          <input type="image_path" name="image_path">
        </label>
        <button type="submit" class="submit">ADD</button>
      </form>
      </div>
    </div>
  </div>
</body>
</html>