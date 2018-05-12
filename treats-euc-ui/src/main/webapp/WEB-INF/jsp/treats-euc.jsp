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
        <a class="navbar-brand" href="/treats-euc">
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
            <a href="/treats-euc/template-edit">Create Template</a>
          </li>
          <li>
            <a href="/treats-euc/eucflow-edit">Create Workflow</a>
          </li>
        </ul>
      </div>
    </nav>

<div class="container-fluid">

<!-- Wizard, Please put the wizard popup code here
     The dynamic flow is not yet ready  -->
  <div class="modal" id="wizard1" tabindex="-1" role="dialog">
  <div class="modal-dialog modal-lg wizard-pf">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true" aria-label="Close">
          <span class="pficon pficon-close"></span>
        </button>
        <h4 class="modal-title">Wizard Title</h4>
      </div>
      <div class="modal-body wizard-pf-body clearfix">
        <div class="wizard-pf-steps">
          <ul class="wizard-pf-steps-indicator wizard-pf-steps-alt-indicator active">

            <li class="wizard-pf-step" data-tabgroup="1">
              <a><span class="wizard-pf-step-number">1</span><span class="wizard-pf-step-title">First Step</span>
                <span class="wizard-pf-step-title-substep active">details</span>
                <span class="wizard-pf-step-title-substep">Settings</span>
              </a>
            </li>

            <li class="wizard-pf-step viewed" data-tabgroup="2">
              <a>
                <span class="wizard-pf-step-number">2</span>
                <span class="wizard-pf-step-title">Second Step</span>
                <span class="wizard-pf-step-title-substep">details</span>
                <span class="wizard-pf-step-title-substep">settings</span>
              </a>
            </li>

            <li class="wizard-pf-step active" data-tabgroup="3">
              <a>
                <span class="wizard-pf-step-number">3</span>
                <span class="wizard-pf-step-title">Review</span>
                <span class="wizard-pf-step-title-substep">summary</span>
                <span class="wizard-pf-step-title-substep active">progress</span>
              </a>
            </li>
          </ul>

          <ul class="wizard-pf-steps-alt">
            <li class="wizard-pf-step-alt viewed">
              <a href="javascript:void(0);" class="disabled">
                <span class="wizard-pf-step-alt-number">1</span>
                <span class="wizard-pf-step-alt-title">First Step</span>
              </a>
              <ul class="hidden">
                <li class="wizard-pf-step-alt-substep"><a href="">1A. Details</a></li>
                <li class="wizard-pf-step-alt-substep"><a class="disabled" href="#">1B. Settings</a></li>
              </ul>
            </li>

            <li class="wizard-pf-step-alt viewed disabled">
              <a href="javascript:void(0);" class="disabled">
                <span class="wizard-pf-step-alt-number">2</span>
                <span class="wizard-pf-step-alt-title">Second Step</span>
              </a>
              <ul class="hidden">
                <li class="wizard-pf-step-alt-substep"><a class="disabled" href="#">2A. Details</a></li>
                <li class="wizard-pf-step-alt-substep"><a class="disabled" href="#">2B. Settings</a></li>
              </ul>
            </li>

            <li class="wizard-pf-step-alt active">
              <a href="javascript:void(0);">
                <span class="wizard-pf-step-alt-number">3</span>
                <span class="wizard-pf-step-alt-title">Third Step</span>
              </a>
              <ul>
                <li class="wizard-pf-step-alt-substep"><a class="disabled" href="#">3A. Summary</a></li>
                <li class="wizard-pf-step-alt-substep active"><a class="disabled" href="#">3B. Progress</a></li>
              </ul>
            </li>
          </ul>
        </div>
        <div class="wizard-pf-row">
          <div class="wizard-pf-sidebar">
            <ul class="list-group">
              <li class="list-group-item">
                <a>
                  <span class="wizard-pf-substep-number">3A.</span>
                  <span class="wizard-pf-substep-title">Summary</span>
                </a>
              </li>
              <li class="list-group-item active">
                <a>
                  <span class="wizard-pf-substep-number">3B.</span>
                  <span class="wizard-pf-substep-title">Progress</span>
                </a>
              </li>
            </ul>
          </div><!-- /.wizard-pf-sidebar -->

          <div class="wizard-pf-main">
            <div class="blank-slate-pf">
              <div class="spinner spinner-lg blank-slate-pf-icon"></div>
              <h3 class="blank-slate-pf-main-action">Deployment in progress</h3>
              <p class="blank-slate-pf-secondary-action">Lorem ipsum dolor sit amet, porta at suspendisse ac, ut wisi
                vivamus, lorem sociosqu eget nunc amet. </p>
            </div>

          </div>
        </div>
      </div><!-- /.wizard-pf-body -->

      <!-- TODO: disable buttons -->
      <div class="modal-footer wizard-pf-footer">
        <button type="button" class="btn btn-default btn-cancel" data-dismiss="modal">Cancel</button>
        <button type="button" class="btn btn-default disabled" data-dismiss="modal">
          <span class="i fa fa-angle-left"></span>
          Back
        </button>
        <button type="button" class="btn btn-primary disabled" data-dismiss="modal">
          Deploy
          <span class="i fa fa-angle-right"></span>
        </button>
      </div><!-- /.wizard-pf-footer -->

    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

  <!-- List of workflows -->
<div id="pf-list-standard" class="list-group list-view-pf list-view-pf-view"></div>
	
</div><!-- /.container_fluid -->	

<!-- Parse Full list of EUC flow -->
<script>
var xmlhttp = new XMLHttpRequest();

xmlhttp.onreadystatechange = function() {
 if (this.readyState == 4 && this.status == 200) {
     var myArr = JSON.parse(this.responseText);
     myFunction(myArr);
  }
};

xmlhttp.open("GET", "/treats-euc/eucflow/getalleucflows", true);
xmlhttp.send();

function myFunction(arr) {
  var out = "";
  var i;
  var idName = "";
  for(i = 0; i < arr.length; i++) {
	idName = 'modify' + i;
    out += '<div class="list-group-item">';
    out += '<div class="list-view-pf-actions">';
	out += '<button class="btn btn-default">Execute</button>';
	out += '<button id="' + idName + '" class="btn btn-default" data-toggle="modal" data-target="#wizard1">Modify</button>';
	out += '<div class="dropdown pull-right dropdown-kebab-pf">';
	out += '</div>';
	out += '</div>';
    out += '<div class="list-view-pf-main-info">';
    out += '<div class="list-view-pf-left">';
    out += '<span class="fa fa-plane list-view-pf-icon-sm"></span>';
    out += '</div>';
    out += '<div class="list-view-pf-body">';
    out += '<div class="list-view-pf-description">';
    out += '<div class="list-group-item-heading">';
	out += 'Workflow_Name' + '';
	out += '</div>';
    out += '<div class="list-group-item-text">';
    out += arr[i].description + '';
    out += '</div>';
    out += '</div>';
    out += '<div class="list-view-pf-additional-info">';
    out += '<div class="list-view-pf-additional-info-item">';
    out += '<span class="pficon pficon-screen"></span>';
    out += 'Source_System' + '';
    out += '</div>';
    out += '<div class="list-view-pf-additional-info-item">';
    out += '<span class="pficon pficon-cluster"></span>';
    out += 'Template_name' + '';
    out += '</div>';
    out += '<div class="list-view-pf-additional-info-item">';
    out += '<span class="pficon pficon-container-node"></span>';
    out += arr[i].output + '';
    out += '</div>';
    out += '<div class="list-view-pf-additional-info-item">';
    out += '<span class="pficon pficon-image"></span>';
    out += arr[i].eucSchedule + '';
    out += '</div>';
    out += '</div>';
    out += '</div>';
    out += '</div>';
    out += '</div>';
  }
  document.getElementById("pf-list-standard").innerHTML = out;
}

</script>

  <script>
  $(document).ready(function () {
	
	// Summernote editor
	 $('#summernote').summernote();

	  
	// Display Wizard
	var beenClicked = false;
    $('#modify0').click(function() {
      if (!beenClicked) {
        beenClicked = true;
        $('#wizard1 .wizard-pf-steps-alt-indicator').on('click', function() {
          $('#wizard1 .wizard-pf-steps-alt-indicator').toggleClass('active');
          $('#wizard1 .wizard-pf-steps-alt').toggleClass('hidden');
        });
      }
    });
	  
    // toggle dropdown menu
    $("#pf-list-simple-expansion .list-view-pf-actions").on('show.bs.dropdown', function () {
      var $this = $(this);
      var $dropdown = $this.find('.dropdown');
      var space = $(window).height() - $dropdown[0].getBoundingClientRect().top - $this.find('.dropdown-menu').outerHeight(true);
      $dropdown.toggleClass('dropup', space < 10);
    });



  });
</script>



  </body>
</html>
