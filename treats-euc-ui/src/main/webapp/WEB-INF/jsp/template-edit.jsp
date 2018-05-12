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
    <link href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.9/summernote.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/c3/0.4.11/c3.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/d3/3.5.17/d3.min.js"></script>
    <script src="https://rawgit.com/patternfly/patternfly/master-dist/dist/js/patternfly.min.js"></script>
	<script src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.9/summernote.js"></script>
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
            <a href="#">Create Template</a>
          </li>
          <li>
            <a href="#">Create Workflow</a>
          </li>
        </ul>
      </div>
    </nav>
<div class="container-flui">
  <div class="row">
  	<div class="col-lg-4 col-lg-push-8">
    	<!-- List of fields -->
    	<div class="form-group">
    		<label for="system-list">Select Source System:</label>
    		<select class = "form-control" id="system-list">
    			<option>TREATS</option>
    			<option>NFOS</option>
    			<option>SUMMIT</option>
    		</select>
    		<label for="table-list">Select Table:</label>
    		<select class = "form-control" id="table-list">
    			<option>MPESPTP</option>
    			<option>MPEFWDP</option>
    			<option>TTCPIPP</option>
    		</select>
    		<label for="field-list">Select Source System:</label>
    		<select class = "form-control" id="field-list">
    			<option>deal_number</option>
    			<option>counterparty</option>
    			<option>amount_pay</option>
    		</select>
    		 <button type="button" class="btn btn-primary" id="Assign">Assign</button>
    		
    	</div>
      
    </div>
    <div class="col-lg-8 col-lg-pull-4">
    	<div id="summernote"></div>
   	</div>
   	
 
  </div>
</div>

<script>
	var SaveButton = function(context) {
		var ui = $.summernote.ui;
		
		//create button
		var button = ui.button({
			contents: '<i class="fa fa-save"/> Save',
			tooptip: 'Save template',
			click: function(){
				//save template logic
			}
		});
		return button.render();
	}
</script>

  <script>
  $(document).ready(function () {
	
	// Summernote editor
	 $('#summernote').summernote({
		 height: 500,
		 minHeight: null,
		 maxHeight: null,
		 focus: true,
		 placeholder: 'Prepare your template here',
		 toolbar:[
			 ['style', ['style']],
			    ['font', ['bold', 'italic', 'underline', 'clear']],
			    ['fontname', ['fontname']],
			    ['color', ['color']],
			    ['para', ['ul', 'ol', 'paragraph']],
			    ['height', ['height']],
			    ['table', ['table']],
			    ['insert', ['link', 'picture', 'hr']],
			    ['view', ['fullscreen', 'codeview']],
			    ['help', ['help']],
			 ['save-button',['save']]
		 ],
		 buttons: {
			 save: SaveButton
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