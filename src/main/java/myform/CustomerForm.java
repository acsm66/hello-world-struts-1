package myform;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class CustomerForm extends ActionForm {
  private static final long serialVersionUID = -6004126195871678830L;

  private String firstName;
  private String lastName;

  public CustomerForm() {
    firstName = "";
    lastName = "";
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String s) {
    this.firstName = s;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String s) {
    this.lastName = s;
  }

  @Override
  public ActionErrors validate(ActionMapping mapping,
      HttpServletRequest request) {
    ActionErrors errors = new ActionErrors();
    if (firstName == null || firstName.trim().equals("")) {
      errors.add("firstName",
          new ActionError("error.cust.firstname.null"));
    }
    return errors;
  }
}
