/**
 * Created by july on 4/18/16.
 */
function Component() {
    this.name = "component";
    this.validate = function(obj) {
    if ($(obj).val().trim()=="") {
            return false;
        }
    return true;
    }
}

function Composite() {
    this.name = "composite";
    this.validate = function() {
        var flag = true;
        $("#form1 :input").each(function(index, element) {
            if (($(element).attr('name') != "image")&& ($(element).attr('name') != "wfVisibility")&& ($(element).attr('name') != undefined)){
            var component = new Component();
            flag = flag && component.validate(element);
          //   alert($(element).attr('name') + "typeof" + typeof $(element).attr('name'));
            if (flag == false) {
                $("<font color='red'>Can't be empty</b>").insertAfter(element);
            }
             }
         });
        return flag;
    }
    this.add = function(){};
}

function toVaild() {
    var pattern = new Composite();
    var result = pattern.validate();
    alert(result);
    return result;
}
