<!DOCTYPE html>
<!--[if IE 9]><html lang="en-us" class="ie9"><![endif]-->
<!--[if gt IE 9]><!-->
<html lang="en-us">
<!--<![endif]-->
  <head>
    <title>Global User Data (GUD) Platform</title>
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
          GUC Home
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
            <a href="#">Modify Template</a>
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
    		<label class="required-pf" for="input-description">
    			Template Description
    		</label>
    		<input type="text" class="form-control" id="input-description" required/>
    		<label for="system-list">Select Source System:</label>
    		<select class = "form-control" id="system-list"></select>
    		<label for="table-list">Select Table:</label>
    		<select class = "form-control" id="table-list"></select>
    		<label for="field-list">Select field:</label>
    		<select class = "form-control" id="field-list"></select>
    		 <button type="button" class="btn btn-primary" id="Assign" onclick="assign()">Assign</button>
    		
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
				saveTemplate();
			}
		});
		return button.render();
	}

	var assign = function() {
		var fieldName = $('#field-list option:selected').text();
		$('#summernote').summernote('insertText', '@' + fieldName + '@');
	}

	var saveTemplate = function() {
	    var form = document.createElement('form');
	    form.setAttribute('method', 'post');
	    form.setAttribute('action', '/treats-euc/doctemplate/create');
	    form.style.display = 'hidden';

	    var input = document.createElement("input");
	    input.setAttribute("type", "hidden");
	    input.setAttribute("name", "description");
	    input.setAttribute("value", $('#input-description').val());
	    form.appendChild(input);
	    
	    var input = document.createElement("input");
	    input.setAttribute("type", "hidden");
	    input.setAttribute("name", "template");
	    input.setAttribute("value", $('#summernote').summernote('code'));
	    form.appendChild(input);
	    
	    document.body.appendChild(form)
	    form.submit();
	}
	
	// Send HTTP request
	function sendRequest(method, url, func){
		var xmlhttp = new XMLHttpRequest();
		xmlhttp.onreadystatechange = function() {
			 if (this.readyState == 4 && this.status == 200) {
				 var Arr = JSON.parse(this.responseText);
				 //html2text(templateArr.docTemplate);
				 //var templateText = jQuery(templateArr.docTemplate).text();
				 
				 if (func == "template") {
					 //load existing template
					 $('#summernote').summernote('code', Arr.docTemplate);
					 //Set document template description
					 document.getElementById('input-description').value = Arr.description;
				 }
				 // Else - handle drop down list
				 if (func == "system-list") {
					 var out = "";
					 var i;
					 out += '<option></option>';
					 for (i = 0; i < Arr.length; i++) {
					  out += '<option>' + Arr[i].dataset + '</option>'
					 }
					 document.getElementById(func).innerHTML = out;
				 }
				 if (func == "table-list") {
					 out += '<option></option>';
					 for (i = 0; i < Arr.length; i++) {
						 out += '<option>' + Arr[i].table + '</option>';
					 }
					 document.getElementById(func).innerHTML = out;
				 }
				 if (func == "field-list") {
					 getFieldlist(func, Arr.fields);
				 }
			  }
		};
		xmlhttp.open(method, url, true);
		xmlhttp.send();
	}
	
	
	function getFieldlist(id, arr) {
		var out = "";
		var i;
		out += '<option></option>';
		for (i = 0; i < arr.length; i++) {
		 out += '<option>' + arr[i].name + '</option>'
		}
		document.getElementById(id).innerHTML = out;
	}
	/*
	function html2text(html) {
	    var tag = document.createElement('div');
	    tag.innerHTML = html;
	    $('#summernote').summernote('insertText', tag.innerText);

	}
	*/
</script>

  <script>
  $(document).ready(function () {
	
	// Summernote editor
	 $('#summernote').summernote({
		 height: 500,
		 minHeight: 500,
		 maxHeight: null,
		 focus: true,
		 placeholder: 'Prepare your template here',
		 toolbar:[
			    ['style', ['style']],
			    ['font', ['bold', 'italic', 'underline', 'clear']],
			    ['color', ['color']],
			    ['para', ['ul', 'ol', 'paragraph']],
			    ['height', ['height']],
			    ['table', ['table']],
			    ['view', ['fullscreen']],
			    ['save-button',['save']]
		 ],
		 buttons: {
			 save: SaveButton
		 }
	 
	 });
	
	//Get template from input id
	var templateReq = new sendRequest('GET', '/treats-euc/doctemplate/getdoctemplate/${templateId}', 'template');
	
	//Get dataset list
	var datasetReq = new sendRequest('GET', '/treats-euc/bigquery/getdatasets', 'system-list');
	
    // toggle dropdown menu
    $("#pf-list-simple-expansion .list-view-pf-actions").on('show.bs.dropdown', function () {
      var $this = $(this);
      var $dropdown = $this.find('.dropdown');
      var space = $(window).height() - $dropdown[0].getBoundingClientRect().top - $this.find('.dropdown-menu').outerHeight(true);
      $dropdown.toggleClass('dropup', space < 10);
    });
	
    // System selected
    $("#system-list").change(function(){
       	var selectedDataset = $('#system-list option:selected').text();
    	var tableReq = new sendRequest('GET', '/treats-euc/bigquery/' + selectedDataset + '/getdatatables', 'table-list');
       	
    });
    
    // tableset selected
    $("#table-list").change(function(){
    	var selectedDatatable = $('#table-list option:selected').text();
    	var system = document.getElementById('system-list').value;
    	var fieldReq = new sendRequest('GET', '/treats-euc/bigquery/' + system + '/' + selectedDatatable + '/getfieldlist', 'field-list');
       	
    });
    

  });
</script>



  </body>
</html>
