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
    <link rel="stylesheet" href="/css/patternfly.min.css" >
    <link rel="stylesheet" href="/css/patternfly-additions.min.css" >
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/c3/0.4.11/c3.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/d3/3.5.17/d3.min.js"></script>
    <script src="https://rawgit.com/patternfly/patternfly/master-dist/dist/js/patternfly.min.js"></script>
  </head>
  
  <body>
  
<!-- Wizard code here -->
<div class="modal" id="wizard1" tabindex="-1" role="dialog">
  <div class="modal-dialog modal-lg wizard-pf">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true" aria-label="Close">
          <span class="pficon pficon-close"></span>
        </button>
        <h4 class="modal-title">Workflow</h4>
      </div>
      <div class="modal-body wizard-pf-body clearfix">
        <div class="wizard-pf-steps hidden">
          <ul class="wizard-pf-steps-indicator wizard-pf-steps-alt-indicator active">

            <li class="wizard-pf-step active">
              <a href="#"><span class="wizard-pf-step-number">1</span><span class="wizard-pf-step-title">First Step</span>
                <span class="wizard-pf-step-title-substep active">details</span>
                <span class="wizard-pf-step-title-substep">Settings</span>
              </a>
            </li>

            <li class="wizard-pf-step">
              <a href="#">
                <span class="wizard-pf-step-number">2</span>
                <span class="wizard-pf-step-title">Second Step</span>
                <span class="wizard-pf-step-title-substep">details</span>
                <span class="wizard-pf-step-title-substep">settings</span>
              </a>
            </li>

            <li class="wizard-pf-step">
              <a href="#">
                <span class="wizard-pf-step-number">3</span>
                <span class="wizard-pf-step-title">Third Step</span>
                <span class="wizard-pf-step-title-substep">summary</span>
                <span class="wizard-pf-step-title-substep">progress</span>
              </a>
            </li>
            
            <!--StanleyO -->
            <li class="wizard-pf-step">
              <a href="#">
                <span class="wizard-pf-step-number">4</span>
                <span class="wizard-pf-step-title">Fourth Step</span>
                <span class="wizard-pf-step-title-substep">summary_4</span>
                <span class="wizard-pf-step-title-substep">progress_4</span>
              </a>
            </li>
            <!--StanleyE -->
            
            <!--StanleyO -->
            <li class="wizard-pf-step">
              <a href="#">
                <span class="wizard-pf-step-number">5</span>
                <span class="wizard-pf-step-title">Review</span>
                <span class="wizard-pf-step-title-substep">summary_5</span>
                <span class="wizard-pf-step-title-substep">progress_5</span>
              </a>
            </li>
            <!--StanleyE -->
          </ul>

          <ul class="wizard-pf-steps-alt">
            <li class="wizard-pf-step-alt viewed">
              <a href="#">
                <span class="wizard-pf-step-alt-number">1</span>
                <span class="wizard-pf-step-alt-title">First Step</span>
              </a>
                  <ul>
                    <li class="wizard-pf-step-alt-substep active"><a href="">1A. Details</a></li>
                    <li class="wizard-pf-step-alt-substep disabled"><a href="#">1B. Settings</a></li>
                  </ul>
            </li>

            <li class="wizard-pf-step-alt">
              <a href="#">
                <span class="wizard-pf-step-alt-number">2</span>
                <span class="wizard-pf-step-alt-title">Second Step</span>
              </a>
                  <ul class="hidden">
                    <li class="wizard-pf-step-alt-substep disabled"><a href="#">2A. Details</a></li>
                    <li class="wizard-pf-step-alt-substep disabled"><a href="#">2B. Settings</a></li>
                  </ul>
            </li>

            <li class="wizard-pf-step-alt">
              <a  href="#">
                <span class="wizard-pf-step-alt-number">3</span>
                <span class="wizard-pf-step-alt-title">Third Step</span>
              </a>
              <ul class="hidden">
                <li class="wizard-pf-step-alt-substep disabled"><a href="#">3A. Summary</a></li>
                <li class="wizard-pf-step-alt-substep disabled"><a href="#">3B. Progress</a></li>
              </ul>
            </li>
            
            <!--StanleyO-->
            <li class="wizard-pf-step-alt">
              <a  href="#">
                <span class="wizard-pf-step-alt-number">4</span>
                <span class="wizard-pf-step-alt-title">Fourth Step</span>
              </a>
              <ul class="hidden">
                <li class="wizard-pf-step-alt-substep disabled"><a href="#">4A. Summary</a></li>
                <li class="wizard-pf-step-alt-substep disabled"><a href="#">4B. Progress</a></li>
              </ul>
            </li>
            <!--StanleyE-->
            
               <!--StanleyO-->
            <li class="wizard-pf-step-alt">
              <a  href="#">
                <span class="wizard-pf-step-alt-number">5</span>
                <span class="wizard-pf-step-alt-title">Review</span>
              </a>
              <ul class="hidden">
                <li class="wizard-pf-step-alt-substep disabled"><a href="#">5A. Summary</a></li>
                <li class="wizard-pf-step-alt-substep disabled"><a href="#">5B. Progress</a></li>
              </ul>
            </li>
            <!--StanleyE-->

          </ul>

        </div>

        <div class="wizard-pf-row">
          <div class="wizard-pf-sidebar hidden">
            <ul class="list-group">
              <li class="list-group-item active">
                <a href="#">
                  <span class="wizard-pf-substep-number">1A.</span>
                  <span class="wizard-pf-substep-title">Details</span>
                </a>
              </li>
              <li class="list-group-item">
                <a href="#">
                  <span class="wizard-pf-substep-number">1B.</span>
                  <span class="wizard-pf-substep-title">Settings</span>
                </a>
              </li>
            </ul>
            <ul class="list-group hidden">
              <li class="list-group-item">
                <a href="#">
                  <span class="wizard-pf-substep-number">2A.</span>
                  <span class="wizard-pf-substep-title">Details</span>
                </a>
              </li>
              <li class="list-group-item">
                <a href="#">
                  <span class="wizard-pf-substep-number">2B.</span>
                  <span class="wizard-pf-substep-title">Settings</span>
                </a>
              </li>
            </ul>
            <ul class="list-group hidden">
              <li class="list-group-item">
                <a>
                  <span class="wizard-pf-substep-number">3A.</span>
                  <span class="wizard-pf-substep-title">Summary</span>
                </a>
              </li>
              <li class="list-group-item">
                <a>
                  <span class="wizard-pf-substep-number">3B.</span>
                  <span class="wizard-pf-substep-title">Progress</span>
                </a>
              </li>
            </ul>
            <!--StanleyO-->
            <ul class="list-group hidden">
              <li class="list-group-item">
                <a>
                  <span class="wizard-pf-substep-number">4A.</span>
                  <span class="wizard-pf-substep-title">Summary</span>
                </a>
              </li>
              <li class="list-group-item">
                <a>
                  <span class="wizard-pf-substep-number">4B.</span>
                  <span class="wizard-pf-substep-title">Progress</span>
                </a>
              </li>
            </ul>
            <!--StanleyE-->
            <!--StanleyO-->
            <ul class="list-group hidden">
              <li class="list-group-item">
                <a>
                  <span class="wizard-pf-substep-number">5A.</span>
                  <span class="wizard-pf-substep-title">Summary</span>
                </a>
              </li>
              <li class="list-group-item">
                <a>
                  <span class="wizard-pf-substep-number">5B.</span>
                  <span class="wizard-pf-substep-title">Progress</span>
                </a>
              </li>
            </ul>
            <!--StanleyE-->
          </div> <!-- /.wizard-pf-sidebar -->
          <div class="wizard-pf-main">
            <div class="wizard-pf-loading blank-slate-pf">
              <div class="spinner spinner-lg blank-slate-pf-icon"></div>
              <h3 class="blank-slate-pf-main-action">Loading Wizard</h3>
              <p class="blank-slate-pf-secondary-action">Workflow template wizard is now preparing the data.</p>
            </div>
     
     <!-- Kelvin: Change to dynamic template list -->
            <div class="wizard-pf-contents hidden">
            	<h1><b>Template Selection</b></h1>
              <form class="form-horizontal" id="wizard-template-list"></form>
            </div>
            
                        <div class="wizard-pf-contents hidden">
              <form class="form-horizontal">
                <div class="form-group required">
                  <label class="col-sm-2 control-label" for="lorem">Lorem ipsum</label>
                  <div class="col-sm-10">
                    <input type="text" id="lorem" class="form-control">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label" for="dolor">Dolor (Optional)</label>
                  <div class="col-sm-10">
                    <textarea id="dolor" class="form-control" rows="2"></textarea>
                  </div>
                </div>
              </form>
            </div>
            
            <div class="wizard-pf-contents hidden">
                <H1><B>Data Filtering</B></H1>
              	<!--StanleyO-->
                <div class="form-group required">
                	
                    <div class="col-md-3">
                	
                    </div>
                    <div class="col-md-3">
                	
                    </div>
                    <div class="col-md-3">
                	
                    </div>
                	<div class="col-md-3" align="right">
                	<button class="btn btn-md btn-primary" type="button" custom-button-width><i class="glyphicon glyphicon-plus"></i> ADD</button>
                	</div>
                	<br> 
                	
                	
                   	<label class="col-sm-3 control-label" for="aliquam"> </label>
                  	<label class="col-sm-3 control-label" for="aliquam"><B>FIELD</B></label>
                  	<label class="col-sm-3 control-label" for="aliquam"><B>RELATION</B></label>
                  	<label class="col-sm-3 control-label" for="aliquam"><B>VALUE</B></label>
                  	<br>
                  	
                  	
                  	<!-- row1 -->
                  	<div class="col-sm-3">
                  	<label class="col-sm-3 control-label" for="aliquam"> </label>
                  	</div>
                  	
                  	<div class="col-sm-3">
      			  	<select class = "form-control" id="data_field_1">
    				<option>deal_number</option>
    				<option>counterparty</option>
    				<option>amount_pay</option>
    				</select>
      			 	</div>
            	  	
              	   	<div class="col-sm-3">
      			  	<select class = "form-control" id="data_relation_1">
    				<option>AND</option>
		          	<option>OR</option>
		          	<option>EQUAL</option>
		          	<option>NOT EQUAL</option>
    				</select>
      			 	</div>
              	 
                             	  
              	  	<div class="col-sm-3">
                    	<textarea id="data_value_1" class="form-control" rows="1"></textarea>
                    </div>
                  	
                  	<br>
                  	<br>
                  	
                  	<!-- row 2 -->
                  	<div class="col-sm-3">
      			  	<select class = "form-control" id="data_and_or_2">
    				<option>AND</option>
		          	<option>OR</option>
		          	</select>
      			 	</div>
                  	
                  	<div class="col-sm-3">
      			  	<select class = "form-control" id="data_field_2">
    				<option>deal_number</option>
    				<option>counterparty</option>
    				<option>amount_pay</option>
    				</select>
      			 	</div>
            	  	
              	   	<div class="col-sm-3">
      			  	<select class = "form-control" id="data_relation_2">
    				<option>AND</option>
		          	<option>OR</option>
		          	<option>EQUAL</option>
		          	<option>NOT EQUAL</option>
    				</select>
      			 	</div>
              	 
                             	  
              	  	<div class="col-sm-3">
                    	<textarea id="data_value_2" class="form-control" rows="1"></textarea>
                    </div>
                  	
                  	<br>
                  	
                  	
                  	
                  	<!-- row 3 -->
                  	<div class="col-sm-3">
      			  	<select class = "form-control" id="data_and_or_3">
    				<option>AND</option>
		          	<option>OR</option>
		          	</select>
      			 	</div>
                  	
                  	<div class="col-sm-3">
      			  	<select class = "form-control" id="data_field_3">
    				<option>deal_number</option>
    				<option>counterparty</option>
    				<option>amount_pay</option>
    				</select>
      			 	</div>
            	  	
              	   	<div class="col-sm-3">
      			  	<select class = "form-control" id="data_relation_3">
    				<option>AND</option>
		          	<option>OR</option>
		          	<option>EQUAL</option>
		          	<option>NOT EQUAL</option>
    				</select>
      			 	</div>
              	 
                             	  
              	  	<div class="col-sm-3">
                    	<textarea id="data_value_3" class="form-control" rows="1"></textarea>
                    </div>
                  	
                	<br>
                	<br>
                	
              	 
                   	
              	  
              	  	
                 
                </div>
                <br>
                
                <!-- StanleyE -->
            </div>
            
            <div class="wizard-pf-contents hidden">
              <form class="form-horizontal">
                <div class="form-group required">
                  <label class="col-sm-2 control-label" for="consectetur">Consectetur</label>
                  <div class="col-sm-10">
                    <input type="text" id="consectetur" class="form-control">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label" for="adipiscing">Adipiscing</label>
                  <div class="col-sm-10">
                    <textarea id="adipiscing" class="form-control" rows="2"></textarea>
                  </div>
                </div>
              </form>
            </div>
            
            <div class="wizard-pf-contents hidden">
               <!-- StanleyO-->
               <!--Save in PC-->
                  <H1><B>Target Location</B></H1>
    				 			<div class="list-view-pf-checkbox">
      							<input type="checkbox" id="pc_checkbox" name="pc_checkbox">
    				 			</div>
 				     			<div class="list-view-pf-main-info">
				       			<div class="list-view-pf-left">
				         			<span class="pficon pficon-save"></span>
				       			</div>
				       			<div class="list-view-pf-body">
				        			<div class="list-view-pf-description">
				          			<div class="list-group-item-heading">
				            			To be saved in PC
				            			
				          			</div>
				          	
				        			</div>
				    				</div>
 			        		</div>	 
 			        		<BR>
 			        		
                 
                 
                <!-- Send by email-->
               
    				 			<div class="list-view-pf-checkbox">
      							<input type="checkbox" id="email_checkbox" name="email_checkbox">
    				 			</div>
 				     			<div class="list-view-pf-main-info">
				       			<div class="list-view-pf-left">
				         			<span class="fa fa-envelope"></span>
				       			</div>
				       			<div class="list-view-pf-body">
				         			<div class="list-view-pf-description">
				           			<div class="list-group-item-heading">
				           				To be sent by email
				           			</div>
				           			
				      	  		</div>
				    				</div>
 			          	</div>	 
 			          	<BR>
                  <P ALIGN=Left><B>Email Address:</B></P>
 			      <input id="email_address" class="form-control"></input>
 			        		
            </div>
            <!--StanleyE-->
            
            <!--StanleyO-->
            <div class="wizard-pf-contents hidden">
              <form class="form-horizontal">
                <div class="form-group required">
                  <label class="col-sm-2 control-label" for="consectetur">Consectetur</label>
                  <div class="col-sm-10">
                    <input type="text" id="consectetur" class="form-control">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label" for="adipiscing">Adipiscing</label>
                  <div class="col-sm-10">
                    <textarea id="adipiscing" class="form-control" rows="2"></textarea>
                  </div>
                </div>
              </form>
            </div>
            <!--StanleyE-->
            
                <!--StanleyO-->
            <div class="wizard-pf-contents hidden">
            	<H1><B>Scheduling</B></H1>
              <form class="form-horizontal">
               <!-- StanleyO-->
               <!--Save in PC-->
                <div class="list-group-item">
    				 			<div class="list-view-pf-checkbox">
      							<input type="checkbox" id="schedule_checkbox">
    				 			</div>
 				     			<div class="list-view-pf-main-info">
				       			<div class="list-view-pf-left">
				         			<span class="fa fa-clock-o"></span>
				       			</div>
				       			<div class="list-view-pf-body">
				        			<div class="list-view-pf-description">
				          			<div class="list-group-item-heading">
				            			Select the checkbox if scheduling is required. Otherwise, the workflow has to be triggered manually.
				          			</div>
				          			
				        			</div>
				    				</div>
 			        		</div>	 
 			        		
  
                 </div>
              
              <div class="list-group-item">
                 	
                 	<P ALIGN=Left><B>Effective from:</B></P>
                  
                  <BR>
									
				          <!-- Datepicker as text field -->         
				          <div class="input-group date" data-date-format="dd.mm.yyyy hh:mm">
				            <input  type="text" class="form-control" placeholder="dd.mm.yyyy hh:mm">
				            <div class="input-group-addon" >
				              <span class="fa fa-clock"></span>
				            </div>
				          </div>
				         
				          <BR>
				          <BR>
				          
				          
				          <P ALIGN=Left><B>Reoccurrence:</B></P>
                 
                  <BR>
									<div class="col-sm-12">
				          	<div class="form-group" id="single-select-field_occur">
        								<div class="btn-group bootstrap-select form-control">
        								<button type="button" class="btn dropdown-toggle btn-default" data-toggle="dropdown" role="button" title="Relish" aria-expanded="false">
        									<span class="filter-option pull-left">No</span>&nbsp; 
        									<span class="bs-caret"><span class="caret"></span></span>
        								</button>
        								<div class="dropdown-menu open" role="combobox" style="max-height: 456px; overflow: hidden; min-height: 83px;">
        									<ul class="dropdown-menu inner" role="listbox" aria-expanded="false" style="max-height: 444px; overflow-y: auto; min-height: 71px;">
        									<option>&nbsp;No</option>
        									<option>&nbsp;Hourly</option>
		          						<option>&nbsp;Daily</option>
		          						<option>&nbsp;Weekly</option>	
		          						<option>&nbsp;Every Two Weeks</option>	          		
		          						<option>&nbsp;Monthly</option>
		          						<option>&nbsp;Yearly</option>
		        							</select>
		        						</div>
      									</div>
      								</div>        	
            </div>
        

                 </div>
                 
              </form>
            </div>
            <!--StanleyE-->
            
                <!--StanleyO-->
            <div class="wizard-pf-contents hidden">
              <form class="form-horizontal">
                <div class="form-group required">
                  <label class="col-sm-2 control-label" for="consectetur">Consectetur5</label>
                  <div class="col-sm-10">
                    <input type="text" id="consectetur" class="form-control">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-sm-2 control-label" for="adipiscing">Adipiscing</label>
                  <div class="col-sm-10">
                    <textarea id="adipiscing" class="form-control" rows="2"></textarea>
                  </div>
                </div>
              </form>
            </div>
            <!--StanleyE-->
            
            <!--StanleyO-->
            <div class="wizard-pf-contents hidden">
            	<h1><n>Summary</n></h1>          
                <p align=Left><b>Workflow Name:</b></p>
 			    <input id="workflow_name" class="form-control"></input>      	
          		
          		<!-- Stanley<input id="summary_email_address" class="form-control"></input>-->
          		<br>
          		<br>
          		<!-- Stanley<output class="form-control" id="summary_form")></output>-->
          		<b>Template Selection:</b>
				<div class="summary_1" id="summary_1"></div>
				<br>
				<b>Data Filtering:</b>
				<div class="summary_2" id="summary_2"></div>
				<br>
				<b>Target Location:</b>
				<div class="summary_3" id="summary_3"></div>
				<div class="summary_5" id="summary_5"></div>
				<br>
				<b>Scheduling/Manual:</b>
				<div class="summary_4" id="summary_4"></div>
				<br>
            </div>
            <!--StanleyE-->
            
            
          </div><!-- /.wizard-pf-main -->
        </div>

      </div><!-- /.wizard-pf-body -->

      <div class="modal-footer wizard-pf-footer">
        <button type="button" class="btn btn-default btn-cancel wizard-pf-cancel wizard-pf-dismiss">Cancel</button>
        <button type="button" class="btn btn-default wizard-pf-back">
          <span class="i fa fa-angle-left"></span>
          Back
        </button>
        <button type="button" class="btn btn-primary wizard-pf-next">
          Next
          <span class="i fa fa-angle-right"></span>
        </button>
        
        <button type="button" class="btn btn-primary hidden wizard-pf-close wizard-pf-dismiss wizard-pf-finish">Confirm</button>

      </div><!-- /.wizard-pf-footer -->

    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->


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
                <a href="/logout">Logout</a>
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
          <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Modify Template <span class="fa fa-caret-down"></span></a>
            <ul id="full-doc-template" class="dropdown-menu"></ul>
          
          <li>
            <a href="#" class="display-wizard" data-target="#wizard1">Create Workflow</a>
          </li>
        </ul>
      </div>
    </nav>

<div class="container-fluid">

  <!-- List of workflows -->
<div id="full-euc-list" class="list-group list-view-pf list-view-pf-view"></div>
	
</div><!-- /.container_fluid -->	


<script>


// Send HTTP request
function sendRequest(method, url, targetid){
	var xmlhttp = new XMLHttpRequest();
	xmlhttp.onreadystatechange = function() {
		 if (this.readyState == 4 && this.status == 200) {
			 if (targetid == 'full-euc-list') {
				 var eucArr = JSON.parse(this.responseText);
			     loadEucList(eucArr, targetid);
			 };
			 if (targetid == 'full-doc-template') {
				 var docArr = JSON.parse(this.responseText);
			     loadDocList(docArr, targetid);
			 };
		  }
		};
	xmlhttp.open(method, url, true);
	xmlhttp.send();
}

// Load full Doc template list
function loadDocList(arr, tar) {
	var out = "";
	var out1 = "";
	var templatelistid = "";
	var i;
	for(i = 0; i < arr.length; i++) {
		//for modify template
		out += '<li><a href="' + '/treats-euc/template-edit/' + arr[i].id + '">' + arr[i].description + '</a></li>';
		//for wizard
		templatelistid = 'template_checkbox_' + i;
		
		out1 += '<div class="list-group-item">';
		out1 += '<div class="list-view-pf-checkbox">';
		out1 += '<input type="checkbox" id="' + templatelistid +'" name="' + templatelistid + '">';
		out1 += '</div>';
		out1 += '<div class="list-view-pf-main-info">';
		out1 += '<div class="list-view-pf-left">';
		out1 += '<span class="fa fa-file list-view-pf-icon-sm"></span>';
		out1 += '</div>';
		out1 += '<div class="list-view-pf-body">';
		out1 += '<div class="list-view-pf-description">';
		out1 += '<div class="list-group-item-heading">';
		out1 += arr[i].description;
		out1 += '</div>';
		//out1 += '<div class="list-group-item-text">';
		//out1 += arr[i].description;
		//out1 += '</div>';
		out1 += '</div>';
		out1 += '</div>';
		out1 += '</div>';
		out1 += '</div>';
	}
	document.getElementById(tar).innerHTML = out;
	//load document list for wizard also
	document.getElementById('wizard-template-list').innerHTML = out1;
}

// Load full EUC list
function loadEucList(arr, tar) {
  var out = "";
  var i;
  var idName = "";
  for(i = 0; i < arr.length; i++) {
	idName = 'modify' + i;
    out += '<div class="list-group-item">';
    out += '<div class="list-view-pf-actions">';
	out += '<button type="button" class="btn btn-default" onclick="execute(\'' + arr[i].id + '\')">Execute</button>';
	out += '<button class="btn btn-default wizard-pf-open wizard-pf-complete" data-target="#wizard1">Modify</button>';
	out += '<div class="dropdown pull-right dropdown-kebab-pf">';
	out += '</div>';
	out += '</div>';
    out += '<div class="list-view-pf-main-info">';
    out += '<div class="list-view-pf-left">';
    out += '<span class="fa fa-tasks list-view-pf-icon-sm"></span>';
    out += '</div>';
    out += '<div class="list-view-pf-body">';
    out += '<div class="list-view-pf-description">';
    out += '<div class="list-group-item-heading">';
	out += arr[i].name;
	out += '</div>';
    out += '<div class="list-group-item-text">';
    out += arr[i].description;
    out += '</div>';
    out += '</div>';
    out += '<div class="list-view-pf-additional-info">';
    out += '<div class="list-view-pf-additional-info-item">';
    out += '<span class="fa fa-database"></span>';
    out += arr[i].dataSource + '';
    out += '</div>';
    out += '<div class="list-view-pf-additional-info-item">';
    out += '<span class="fa fa-file"></span>';
    out += arr[i].templateName + '';
    out += '</div>';
    out += '<div class="list-view-pf-additional-info-item">';
    out += '<span class="fa fa-plane"></span>';
    out += arr[i].outputMedium + '/' + arr[i].outputFormat + '';
    out += '</div>';
    out += '<div class="list-view-pf-additional-info-item">';
    out += '<span class="fa fa-calendar"></span>';
    out += arr[i].schedule + '';
    out += '</div>';
    out += '</div>';
    out += '</div>';
    out += '</div>';
    out += '</div>';
  }
  document.getElementById(tar).innerHTML = out;
  var modifyWizard = new wizard(".btn.wizard-pf-complete");
}


</script>

  <script>
  $(document).ready(function () {  
    // toggle dropdown menu
    $("#pf-list-simple-expansion .list-view-pf-actions").on('show.bs.dropdown', function () {
      var $this = $(this);
      var $dropdown = $this.find('.dropdown');
      var space = $(window).height() - $dropdown[0].getBoundingClientRect().top - $this.find('.dropdown-menu').outerHeight(true);
      $dropdown.toggleClass('dropup', space < 10);
    });

    var completeWizard = new wizard(".display-wizard");
    var fullEucFlow = new sendRequest('GET','/treats-euc/eucflow/getalleucflowsdisplay','full-euc-list');
    var fullDocTemplate = new sendRequest('GET','/treats-euc/doctemplate/getalldoctemplates','full-doc-template');
  
  });
</script>

<script>
  
  var wizard = function(id) {
    var self = this, modal, tabs, tabCount, tabLast, currentGroup, currentTab, contents;
    self.id = id;

    $(self.id).click(function() {
        self.init(this)
    });
   
    this.init = function(button){
      // get id of open modal
      self.modal = $(button).data("target");

      self.resetToInitialState();

      // open modal
      $(self.modal).modal('show');

      // assign data attribute to all tabs
      $(self.modal + " .wizard-pf-sidebar .list-group-item").each(function() {
          // set the first digit (i.e. n.0) equal to the index of the parent tab group
          // set the second digit (i.e. 0.n) equal to the index of the tab within the tab group
          $(this).attr("data-tab", ($(this).parent().index() +1 + ($(this).index()/10 + .1)));
      });
      // assign data attribute to all tabgroups
      $(self.modal + " .wizard-pf-sidebar .list-group").each(function() {
          // set the value equal to the index of the tab group
          $(this).attr("data-tabgroup", ($(this).index() +1));
      });

      // assign data attribute to all step indicator steps
      $(self.modal + " .wizard-pf-steps-indicator  .wizard-pf-step").each(function() {
        // set the value equal to the index of the tab group
        $(this).attr("data-tabgroup", ($(this).index() +1));
      });
      // assign data attribute to all step indicator substeps
      $(self.modal + " .wizard-pf-steps-indicator .wizard-pf-step-title-substep").each(function() {
        // set the first digit (i.e. n.0) equal to the index of the parent tab group
        // set the second digit (i.e. 0.n) equal to the index of the tab within the tab group
        $(this).attr("data-tab", ($(this).parent().parent().index() + 1 + (($(this).index() - 2)/10 + .1)));
      });

      // assign data attribute to all alt step indicator steps
      $(self.modal + " .wizard-pf-steps-alt .wizard-pf-step-alt").each(function() {
        // set the value equal to the index of the tab group
        var tabGroup = $(this).index() + 1;
        $(this).attr("data-tabgroup", tabGroup);
        $(this).find('.wizard-pf-step-alt-substep').each(function() {
          $(this).attr("data-tab", (tabGroup + (($(this).index() + 1)/10)));
        });
      });

      // assign active and hidden states to teh steps alt classes
      $(self.modal + " .wizard-pf-steps-alt-indicator").removeClass('active');
      $(self.modal + " .wizard-pf-steps-alt").addClass('hidden');
      $(self.modal + " .wizard-pf-steps-alt-indicator").on('click', function() {
        $(self.modal + ' .wizard-pf-steps-alt-indicator').toggleClass('active');
        $(self.modal + ' .wizard-pf-steps-alt').toggleClass('hidden');
      });
      $(self.modal + " .wizard-pf-step-alt > ul").addClass("hidden");

      // create array of all tabs, using the data attribute, and determine the last tab
      self.tabs = $(self.modal + " .wizard-pf-sidebar .list-group-item" ).map(function()
        {
          return $(this).data("tab");
        }
      );
      self.tabCount = self.tabs.length;
      self.tabSummary = self.tabs[self.tabCount - 2]; // second to last tab displays summary
      self.tabLast = self.tabs[self.tabCount - 1]; // last tab displays progress
      // set first tab group and tab as current tab
      // if someone wants to target a specific tab, that could be handled here
      self.currentGroup = 1;
      self.currentTab = 1.1;

      setTimeout(function() {
        // hide loading message
        $(self.modal + " .wizard-pf-loading").addClass("hidden");
        // show tabs and tab groups
        $(self.modal + " .wizard-pf-steps").removeClass("hidden");
        <!--Stanley $(self.modal + " .wizard-pf-sidebar").removeClass("hidden"); -->
        // remove active class from all tabs
        <!--Stanley $(self.modal + " .wizard-pf-sidebar .list-group-item.active").removeClass("active"); -->

        self.updateToCurrentPage();
      }, 300);

      //initialize click listeners
      self.tabGroupSelect();
      self.tabSelect();
      self.altStepClick();
      self.altSubStepClick();
      self.backBtnClicked();
      self.nextBtnClicked();
      self.finishBtnClick();
      self.cancelBtnClick();

      // Listen for required value change
      self.detailsNameChange();
    };

    // update which tab group is active
    this.updateTabGroup = function() {
      $(self.modal + " .wizard-pf-step.active").removeClass("active");
      $(self.modal + " .wizard-pf-step[data-tabgroup='" + self.currentGroup + "']").addClass("active");
      $(self.modal + " .wizard-pf-sidebar .list-group").addClass("hidden");
      $(self.modal + " .list-group[data-tabgroup='" + self.currentGroup + "']").removeClass("hidden");
      $(self.modal + " .wizard-pf-step-alt[data-tabgroup='" + self.currentGroup + "']").addClass("viewed");
      $(self.modal + " .wizard-pf-step-alt > ul").addClass("hidden");
      $(self.modal + " .wizard-pf-step-alt[data-tabgroup='" + self.currentGroup + "'] > ul").removeClass("hidden");
    };

    // update which tab is active
    this.updateActiveTab = function() {
      $(self.modal + " .list-group-item.active").removeClass("active");
      $(self.modal + " .list-group-item[data-tab='" + self.currentTab + "']").addClass("active");

      // Update steps indicator to handle mobile mode
      $(self.modal + " .wizard-pf-steps-indicator .wizard-pf-step-title-substep").removeClass("active");
      $(self.modal + " .wizard-pf-steps-indicator .wizard-pf-step-title-substep[data-tab='" + self.currentTab + "']").addClass("active");

      // Update steps alt indicator to handle mobile mode
      $(self.modal + " .wizard-pf-step-alt .wizard-pf-step-alt-substep").removeClass("active");
      $(self.modal + " .wizard-pf-step-alt .wizard-pf-step-alt-substep[data-tab='" + self.currentTab + "']").addClass("active");

      self.updateVisibleContents();
    };

    // update which contents are visible
    this.updateVisibleContents = function() {
      var tabIndex = ($.inArray(self.currentTab, self.tabs));
      // displaying contents associated with currentTab
      $(self.modal + " .wizard-pf-contents").addClass("hidden");
      $(self.modal + " .wizard-pf-contents:eq(" + tabIndex + ")").removeClass("hidden");
      // setting focus to first form field in active contents
      setTimeout (function() {
        $(".wizard-pf-contents:not(.hidden) form input, .wizard-pf-contents:not(.hidden) form textarea, .wizard-pf-contents:not(.hidden) form select").first().focus(); // this does not account for disabled or read-only inputs
      }, 100);

      
     
     //template selected
     if ($('#template_checkbox_2').is(":checked")) {
    	 var template_id_sel = $('#template_checkbox_2').attr("id");
    	
     }  
         
     //data_filtering
     var data_filtering= "'" + $('#data_field_1').val() + " " + $('#data_relation_1').val() + " "+ $('#data_value_1').val() + "'"+ " " + $('#data_and_or_2').val() + " " + "'"+ $('#data_field_2').val() + " " + $('#data_relation_2').val() + " "+ $('#data_value_2').val() + "' "+ $('#data_and_or_3').val() + "'" + " " + $('#data_field_3').val() + " " + $('#data_relation_3').val() + " "+ $('#data_value_3').val() +"'"
     
     //target location
     if ($('#pc_checkbox').is(":checked")) {
    	 //var target_location = $('#pc_checkbox').attr("id");
    	 var target_location = "Saved in PC"
    	 $('#summary_5').addClass("hidden");
    	 
     }  else {
    if ($('#email_checkbox').is(":checked")) {
    	//var target_location = $('#email_checkbox').attr("id");
    	var target_location = "Email"
    	$('#summary_5').removeClass("hidden");
    	  
    }}
     
     // email_address
     var emailaddress = $('#email_address').val();
     $('#summary_form').val(emailaddress); 

     //scheduling or manual
     if ($('#schedule_checkbox').is(":checked")) {
    	 var sch_or_manual = "Schedule";
    	 $('#summary_form').val('<h1>'); 
    	
     }  else {
    	 var sch_or_manual = "Manual";
    	 $('#summary_form').val(sch_or_manual); 
    }
     
     $('#summary_1').text(template_id_sel) ;
     $('#summary_2').text(data_filtering) ;
     $('#summary_3').text(target_location) ; 
     $('#summary_5').text(emailaddress) ;
     $('#summary_4').text(sch_or_manual) ;
     
    };
    

    // update display state of Back button
    this.updateBackBtnDisplay = function() {
      if (self.currentTab == self.tabs[0]) {
        $(self.modal + " .wizard-pf-back").addClass("disabled");
      } else {$(self.modal + " .wizard-pf-back").removeClass("disabled");}
      
    };

    // update display state of next/finish button
    this.updateNextBtnDisplay = function() {
      if (self.currentTab == self.tabSummary) {
        $(self.modal + " .wizard-pf-next").addClass("hidden");
        $(self.modal + " .wizard-pf-finish").removeClass("hidden");
      } else {
        $(self.modal + " .wizard-pf-finish").addClass("hidden");
        $(self.modal + " .wizard-pf-next").removeClass("hidden");
      }
    };

    // update display state of buttons in the footer
    this.updateWizardFooterDisplay = function() {
      self.updateBackBtnDisplay();
      self.updateNextBtnDisplay();
    };


    this.updateToCurrentPage = function() {
      self.updateTabGroup();
      self.updateActiveTab();

      self.updateVisibleContents();

      if (self.currentTab === self.tabLast) {
        $(self.modal + " .wizard-pf-next").addClass("hidden");
        $(self.modal + " .wizard-pf-finish").removeClass("hidden");
        self.finish();
      } else {
        // show/hide/disable/enable buttons if needed
        self.updateWizardFooterDisplay();
      }
    };

    // when the user clicks a step, then the tab group for that step is displayed
    this.tabGroupSelect = function() {
      $(self.modal + " .wizard-pf-step>a").click(function() {
        self.currentGroup = $(this).parent().data("tabgroup");
        // update value for currentTab -- if a tab is already marked as active
        // for the new tab group, use that, otherwise set it to the first tab
        // in the tab group
        self.currentTab = $(self.modal + " .list-group[data-tabgroup='" + self.currentGroup + "'] .list-group-item.active").data("tab");
        if (self.currentTab === undefined) {
          self.currentTab = self.currentGroup + 0.1;
        }

        self.updateToCurrentPage();
      });
    };

    // when the user clicks a tab, then the tab contents are displayed
    this.tabSelect = function() {
      $(self.modal + " .wizard-pf-sidebar .list-group-item>a").click(function() {
        // update value of currentTab to new active tab
        self.currentTab = $(this).parent().data("tab");
        self.updateToCurrentPage();
      });
    };

    this.altStepClick = function() {
      $(self.modal + " .wizard-pf-step-alt").each(function() {
        var $this = $(this);
        $this.find('> a').on('click', function() {
          var subStepList = $this.find('> ul');
          if (subStepList && (subStepList.length > 0)) {
            $this.find('> ul').toggleClass('hidden');
          } else {
            self.currentGroup = $this.data("tabgroup");
          }
        });
      });
    };

    this.altSubStepClick = function() {
      $(self.modal + " .wizard-pf-step-alt .wizard-pf-step-alt-substep > a").on('click', function() {
        // update value of currentTab to new active tab
        self.currentTab = $(this).parent().data("tab");
        self.currentGroup = $(this).parent().parent().parent().data("tabgroup");

        self.updateToCurrentPage();
      });
    };
    // Back button clicked
    this.backBtnClicked = function() {
      $(self.modal + " .wizard-pf-back").click(function() {
        // if not the first page
        if (self.currentTab != self.tabs[0]) {
          // go back a page (i.e. -1)
          self.wizardPaging(-1);
          // show/hide/disable/enable buttons if needed
          self.updateWizardFooterDisplay();
        }
      });
    };

    // Next button clicked
    this.nextBtnClicked = function() {
      $(self.modal + " .wizard-pf-next").click(function() {
        // go forward a page (i.e. +1)
        self.wizardPaging(1);
        // show/hide/disable/enable buttons if needed
        self.updateWizardFooterDisplay();
      });
    };

    // Finish button clicked
    // Deploy/Finish button would only display during the second to last step.
    this.finishBtnClick = function() {
      $(self.modal + " .wizard-pf-finish").click(function() {
        self.wizardPaging(1);
        self.finish();
      });
    };

    this.detailsNameChange = function() {
      $(self.modal + " #detailsName").on('change', function() {
        if ($(self.modal + " #detailsName").val()) {
          $(self.modal + " .wizard-pf-step-alt-substep").removeClass('disabled');
          $(self.modal + " .wizard-pf-next").removeClass("disabled");
        } else {
          $(self.modal + " .wizard-pf-step-alt-substep").addClass('disabled');
          $(self.modal + " .wizard-pf-step-alt-substep.active").removeClass('disabled');
          $(self.modal + " .wizard-pf-next").addClass("disabled");
        }
      });
    };

    this.resetToInitialState = function() {
      // drop click event listeners
      $(self.modal + " .wizard-pf-step>a").off("click");
      $(self.modal + " .wizard-pf-sidebar .list-group-item>a").off("click");
      $(self.modal + " .wizard-pf-steps-alt-indicator").off('click');
      $(self.modal + " .wizard-pf-step-alt > a").off('click');
      $(self.modal + " .wizard-pf-back").off("click");
      $(self.modal + " .wizard-pf-next").off("click");
      $(self.modal + " .wizard-pf-finish").off("click");
      $(self.modal + " .wizard-pf-dismiss").off("click");

      $(self.modal + " #detailsName").off('change');

      // reset final step
      $(self.modal + " .wizard-pf-process").removeClass("hidden");
      $(self.modal + " .wizard-pf-complete").addClass("hidden");
      // reset loading message
      $(self.modal + " .wizard-pf-contents").addClass("hidden");
      $(self.modal + " .wizard-pf-loading").removeClass("hidden");
      // remove tabs and tab groups
      $(self.modal + " .wizard-pf-steps").addClass("hidden");
      $(self.modal + " .wizard-pf-sidebar").addClass("hidden");
      // reset buttons in final step
      $(self.modal + " .wizard-pf-close").addClass("hidden");
      $(self.modal + " .wizard-pf-cancel").removeClass("hidden");
    };

    // Cancel/Close button clicked
    this.cancelBtnClick = function() {
      $(self.modal + " .wizard-pf-dismiss").click(function() {
        // close the modal
        $(self.modal).modal('hide');
        self.resetToInitialState();
      });
    };

    // when the user clicks Next/Back, then the next/previous tab and contents display
    this.wizardPaging = function(direction) {
      // get n.n value of next tab using the index of next tab in tabs array
      var tabIndex = ($.inArray(self.currentTab, self.tabs)) + direction*2;
      //StanleyO-->
      var newTab = self.tabs[tabIndex];
      //StanleyE-->
      // add/remove active class from current tab group
      // included math.round to trim off extra .000000000002 that was getting added
      if (newTab != Math.round(10*(direction*.1 + self.currentTab))/10) {
        // this statement is true when the next tab is in the next tab group
        // if next tab is in next tab group (e.g. next tab data-tab value is
        // not equal to current tab +.1) then apply active class to next
        // tab group and step, and update the value for var currentGroup +/-1
        self.currentGroup = self.currentGroup + direction;
        self.updateTabGroup();
      }
      self.currentTab = newTab;
      // remove active class from active tab in current tab group
      $(self.modal + " .list-group[data-tabgroup='" + self.currentGroup + "'] .list-group-item.active").removeClass("active");
      // apply active class to new current tab and associated contents
      self.updateActiveTab();
    };

    // This code keeps the same contents div active, but switches out what
    // contents display in that div (i.e. replaces process message with
    // success message).
    this.finish = function() {
      $(self.modal + " .wizard-pf-back").addClass("disabled"); // if Back remains enabled during this step, then the Close button needs to be removed when the user clicks Back
      $(self.modal + " .wizard-pf-finish").removeClass("disabled");
      // code for kicking off process goes here
      // the next code is just to simulate the expected experience, in that
      // when the process is complete, the success message etc. would display
      setTimeout (function() {
        $(self.modal + " .wizard-pf-cancel").addClass("hidden");
        $(self.modal + " .wizard-pf-finish").addClass("hidden");
        $(self.modal + " .wizard-pf-close").removeClass("hidden");
        $(self.modal + " .wizard-pf-process").addClass("hidden");
        $(self.modal + " .wizard-pf-complete").removeClass("hidden");
      }, 3);
    };

  };

</script>


<script>

	var execute = function(id){
		window.alert(id);

		$.get( "/treats-euc/workflow/execute/" + id);
		
	}

</script>

  </body>
</html>
