<!DOCTYPE html>
<!--[if IE 9]><html lang="en-us" class="ie9"><![endif]-->
<!--[if gt IE 9]><!-->
<html lang="en-us">
<!--<![endif]-->
  <head>
    <title>TREATS EUC</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="../img/favicon.ico">
    <!-- iPad retina icon -->
    <link rel="apple-touch-icon-precomposed" sizes="152x152" href="../img/apple-touch-icon-precomposed-152.png">
    <!-- iPad retina icon (iOS < 7) -->
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../img/apple-touch-icon-precomposed-144.png">
    <!-- iPad non-retina icon -->
    <link rel="apple-touch-icon-precomposed" sizes="76x76" href="../img/apple-touch-icon-precomposed-76.png">
    <!-- iPad non-retina icon (iOS < 7) -->
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../img/apple-touch-icon-precomposed-72.png">
    <!-- iPhone 6 Plus icon -->
    <link rel="apple-touch-icon-precomposed" sizes="120x120" href="../img/apple-touch-icon-precomposed-180.png">
    <!-- iPhone retina icon (iOS < 7) -->
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../img/apple-touch-icon-precomposed-114.png">
    <!-- iPhone non-retina icon (iOS < 7) -->
    <link rel="apple-touch-icon-precomposed" sizes="57x57" href="../img/apple-touch-icon-precomposed-57.png">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/patternfly/3.45.3/css/patternfly.min.css" >
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/patternfly/3.45.3/css/patternfly-additions.min.css" >
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/c3/0.4.11/c3.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/d3/3.5.17/d3.min.js"></script>
    <script src="https://rawgit.com/patternfly/patternfly/master-dist/dist/js/patternfly.min.js"></script>
  </head>
  
  <body>
    <nav class="navbar navbar-default navbar-pf" role="navigation">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse-1">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="/">
          TREATS EUC
        </a>
      </div>
      <div class="collapse navbar-collapse navbar-collapse-1">
        <ul class="nav navbar-nav navbar-utility">
          <li class="dropdown">
            <a href="#0" class="nav-item-iconic" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
              <span title="Help" class="fa pficon-help"></span>
              <span class="caret"></span>
            </a>
            <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
              <li><a href="#0">Help</a></li>
              <li><a href="#0">About</a></li>
            </ul>
          </li>
          <li class="dropdown">
            <a href="#0" class="dropdown-toggle" data-toggle="dropdown">
              <span class="pficon pficon-user"></span>
              Kelvin Choy <b class="caret"></b>
            </a>
            <ul class="dropdown-menu">
              <li>
                <a href="#0">View Profile</a>
              </li>
              <li>
                <a href="#0">Logout</a>
              </li>
              <li class="divider"></li>
              <li class="dropdown-submenu">
                <a tabindex="-1" href="#0">More options</a>
                <ul class="dropdown-menu">
                  <li>
                    <a href="#0">Link</a>
                  </li>
                  <li>
                    <a href="#0">Another link</a>
                  </li>
                  <li>
                    <a href="#0">Something else here</a>
                  </li>
                  <li class="divider"></li>
                  <li class="dropdown-header">Nav header</li>
                  <li>
                    <a href="#0">Separated link</a>
                  </li>
                  <li class="divider"></li>
                  <li>
                    <a href="#0">One more separated link</a>
                  </li>
                </ul>
              </li>
              <li class="divider"></li>
              <li>
                <a href="#0">One more separated link</a>
              </li>
            </ul>
          </li>
        </ul>
        <ul class="nav navbar-nav navbar-primary">
          <li>
            <a href="#">Create Template</a>
          </li>
          <li>
            <a href="#">Create Workflow</a>
          </li>
        </ul>
      </div>
    </nav>
  
  <!-- List of workflows -->
  <div class="container-fluid">
<div id="pf-list-standard" class="list-group list-view-pf list-view-pf-view">

	<!-- List 1 -->
  <div class="list-group-item">
   
    <div class="list-view-pf-actions">
      <button class="btn btn-default">Execute</button>
      <button class="btn btn-default">Modify</button>
      <div class="dropdown pull-right dropdown-kebab-pf">
 
  
</div>

    </div>
    <div class="list-view-pf-main-info">
      <div class="list-view-pf-left">
        <span class="fa fa-plane list-view-pf-icon-sm"></span>
      </div>
      <div class="list-view-pf-body">
        <div class="list-view-pf-description">
          <div class="list-group-item-heading">
            Workflow 1
          </div>
          <div class="list-group-item-text">
            This Workflow generates TREATS data in PDF
          </div>
        </div>
        <div class="list-view-pf-additional-info">
          <div class="list-view-pf-additional-info-item">
            <span class="pficon pficon-screen"></span>
             TREATS
          </div>
          <div class="list-view-pf-additional-info-item">
            <span class="pficon pficon-cluster"></span>
            Template01
          </div>
          <div class="list-view-pf-additional-info-item">
            <span class="pficon pficon-container-node"></span>
            PDF
          </div>
          <div class="list-view-pf-additional-info-item">
            <span class="pficon pficon-image"></span>
            Daily
          </div>
        </div>
      </div>
    </div>
  </div>
  
<!-- List 2 -->
  <div class="list-group-item">
  
    <div class="list-view-pf-actions">
      <button class="btn btn-default">Execute</button>
      <button class="btn btn-default">Modify</button>
      
      <div class="dropdown pull-right dropdown-kebab-pf">
  	 
    </div>

    </div>
    <div class="list-view-pf-main-info">
      <div class="list-view-pf-left">
        <span class="fa fa-plane list-view-pf-icon-sm"></span>
      </div>
      <div class="list-view-pf-body">
        <div class="list-view-pf-description">
          <div class="list-group-item-heading">
            Workflow 2
          </div>
          <div class="list-group-item-text">
            This Workflow generates TREATS data in EXCEL
          </div>
        </div>
        <div class="list-view-pf-additional-info">
           <div class="list-view-pf-additional-info-item">
            <span class="pficon pficon-screen"></span>
             TREATS
          </div>
          <div class="list-view-pf-additional-info-item">
            <span class="pficon pficon-cluster"></span>
            Template02
          </div>
          <div class="list-view-pf-additional-info-item">
            <span class="pficon pficon-container-node"></span>
            EXCEL
          </div>
          <div class="list-view-pf-additional-info-item">
            <span class="pficon pficon-image"></span>
            Weekly
          </div>
        </div>
      </div>
    </div>
  </div>  
  
  <!-- List 3 -->
  <div class="list-group-item">
    
    <div class="list-view-pf-actions">
      <button class="btn btn-default">Execute</button>
      <button class="btn btn-default">Modify</button>
      <div class="dropdown pull-right dropdown-kebab-pf">
  
</div>

    </div>
    <div class="list-view-pf-main-info">
      <div class="list-view-pf-left">
        <span class="fa fa-plane list-view-pf-icon-sm"></span>
      </div>
      <div class="list-view-pf-body">
        <div class="list-view-pf-description">
          <div class="list-group-item-heading">
            Workflow 3
          </div>
          <div class="list-group-item-text">
            This Workflow generates TREATS data in EMAIL
          </div>
        </div>
        <div class="list-view-pf-additional-info">
          <div class="list-view-pf-additional-info-item">
            <span class="pficon pficon-screen"></span>
             TREATS
          </div>
          <div class="list-view-pf-additional-info-item">
            <span class="pficon pficon-cluster"></span>
            Template03
          </div>
          <div class="list-view-pf-additional-info-item">
            <span class="pficon pficon-container-node"></span>
            EMAIL
          </div>
          <div class="list-view-pf-additional-info-item">
            <span class="pficon pficon-image"></span>
            Monthly
          </div>
          </div>
        </div>
      </div>
    </div>
  </div>  
  
 </div>
</div>


  <script>
  $(document).ready(function () {
	
	  
    // Row Checkbox Selection
    $("#pf-list-simple-expansion input[type='checkbox']").change(function (e) {
      if ($(this).is(":checked")) {
        $(this).closest('.list-group-item').addClass("active");
      } else {
        $(this).closest('.list-group-item').removeClass("active");
      }
    });
    // toggle dropdown menu
    $("#pf-list-simple-expansion .list-view-pf-actions").on('show.bs.dropdown', function () {
      var $this = $(this);
      var $dropdown = $this.find('.dropdown');
      var space = $(window).height() - $dropdown[0].getBoundingClientRect().top - $this.find('.dropdown-menu').outerHeight(true);
      $dropdown.toggleClass('dropup', space < 10);
    });

    // click the list-view heading then expand a row
    $("#pf-list-simple-expansion .list-group-item-header").click(function(event){
      if(!$(event.target).is("button, a, input, .fa-ellipsis-v")){
        $(this).find(".fa-angle-right").toggleClass("fa-angle-down")
          .end().parent().toggleClass("list-view-pf-expand-active")
            .find(".list-group-item-container").toggleClass("hidden");
      } else {
      }
    })

    // click the close button, hide the expand row and remove the active status
    $("#pf-list-simple-expansion .list-group-item-container .close").on("click", function (){
      $(this).parent().addClass("hidden")
        .parent().removeClass("list-view-pf-expand-active")
          .find(".fa-angle-right").removeClass("fa-angle-down");
    })

  });
</script>



  </body>
</html>
