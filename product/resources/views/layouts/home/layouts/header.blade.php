<header>
        <!-- Header desktop -->
        <div class="container-menu-desktop">
            <!-- Topbar -->
            <div class="top-bar">
                <div class="content-topbar flex-sb-m h-full container">
                    <div class="left-top-bar">
                        Free shipping for standard order over $100
                    </div>

                    <div class="right-top-bar flex-w h-full">
                        @if(!empty(Auth::user()))
                        <a href="{{route('list.product')}}" class="flex-c-m trans-04 p-lr-25">
                            Admin
                        </a>

                        <a href="#" class="flex-c-m trans-04 p-lr-25">
                            {{Auth::user()->name}}
                        </a>

                        <a href="{{route('user.logout')}}" class="flex-c-m trans-04 p-lr-25">
                            Logout
                        </a>
                        @else
                        <a href="{{route('login.firebase')}}" class="flex-c-m trans-04 p-lr-25">
                            Login
                        </a>

                        <a href="{{route('user.register')}}" class="flex-c-m trans-04 p-lr-25">
                            Register
                        </a>
                        @endif
                    </div>
                </div>
            </div>

            <div class="wrap-menu-desktop how-shadow1">
                <nav class="limiter-menu-desktop container">
                    
                    <!-- Logo desktop -->       
                    <a href="/" class="logo">
                        <h1>VGS Shop</h1>
                    </a>

                    <!-- Menu desktop -->
                    <div class="menu-desktop">
                        <ul class="main-menu">
                            <li>
                                <a href="/">Home</a>
                            </li>

                            <li>
                                <a href="#">Shop</a>
                            </li>

                            <li>
                                <a href="#">Blog</a>
                            </li>

                            <li>
                                <a href="#">About</a>
                            </li>

                            <li>
                                <a href="#">Contact</a>
                            </li>
                        </ul>
                    </div>  

                    <!-- Icon header -->
                    <div class="wrap-icon-header flex-w flex-r-m">
                        <div class="icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11 js-show-modal-search">
                            <i class="zmdi zmdi-search"></i>
                        </div>

                        <div class="icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11 icon-header-noti js-show-cart" data-notify="2">
                            <i class="zmdi zmdi-shopping-cart"></i>
                        </div>

                        <a href="#" class="icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11 icon-header-noti" data-notify="0">
                            <i class="zmdi zmdi-favorite-outline"></i>
                        </a>
                    </div>
                </nav>
            </div>
         

        </div>

        <!-- Header Mobile -->
        <div class="wrap-header-mobile">
            <!-- Logo moblie -->        
            <div class="logo-mobile">
                <h1>VGS Shop</h1>
            </div>

            <!-- Icon header -->
            <div class="wrap-icon-header flex-w flex-r-m m-r-15">
                <div class="icon-header-item cl2 hov-cl1 trans-04 p-r-11 js-show-modal-search">
                    <i class="zmdi zmdi-search"></i>
                </div>

                <div class="icon-header-item cl2 hov-cl1 trans-04 p-r-11 p-l-10 icon-header-noti js-show-cart" data-notify="2">
                    <i class="zmdi zmdi-shopping-cart"></i>
                </div>

                <a href="#" class="dis-block icon-header-item cl2 hov-cl1 trans-04 p-r-11 p-l-10 icon-header-noti" data-notify="0">
                    <i class="zmdi zmdi-favorite-outline"></i>
                </a>
            </div>

            <!-- Button show menu -->
            <div class="btn-show-menu-mobile hamburger hamburger--squeeze">
                <span class="hamburger-box">
                    <span class="hamburger-inner"></span>
                </span>
            </div>
        </div>


        <!-- Menu Mobile -->
        <div class="menu-mobile">
            <ul class="topbar-mobile">
                <li>
                    <div class="left-top-bar">
                        Free shipping for standard order over $100
                    </div>
                </li>

                <li>
                    <div class="right-top-bar flex-w h-full">
                        @if(!empty(Auth::user()))
                        <a href="{{route('list.product')}}" class="flex-c-m trans-04 p-lr-25">
                            Admin
                        </a>

                        <a href="#" class="flex-c-m trans-04 p-lr-25">
                            {{Auth::user()->name}}
                        </a>

                        <a href="{{route('user.logout')}}" class="flex-c-m trans-04 p-lr-25">
                            Logout
                        </a>
                        @else
                        <a href="{{route('login.firebase')}}" class="flex-c-m trans-04 p-lr-25">
                            Login
                        </a>

                        <a href="{{route('user.register')}}" class="flex-c-m trans-04 p-lr-25">
                            Register
                        </a>
                        @endif
                    </div>
                </li>
            </ul>

            <ul class="main-menu-m">
                <li>
                    <a href="/">Home</a>
                </li>

                <li>
                    <a href="#">Shop</a>
                </li>
                <li>
                    <a href="#">Blog</a>
                </li>

                <li>
                    <a href="#">About</a>
                </li>

                <li>
                    <a href="#">Contact</a>
                </li>
            </ul>
        </div>

        <!-- Modal Search -->
        <div class="modal-search-header flex-c-m trans-04 js-hide-modal-search">
            <div class="container-search-header">
                <button class="flex-c-m btn-hide-modal-search trans-04 js-hide-modal-search">
                    <img src="{{asset('home/images/icons/icon-close2.png')}}" alt="CLOSE">
                </button>

                <form class="wrap-search-header flex-w p-l-15">
                    <button class="flex-c-m trans-04">
                        <i class="zmdi zmdi-search"></i>
                    </button>
                    <input class="plh3" type="text" name="search" placeholder="Search...">
                </form>
            </div>
        </div>
    </header>