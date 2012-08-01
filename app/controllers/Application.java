package controllers;

import play.*;
import play.mvc.*;
import play.data.*;

import views.html.*;

import models.*;

public class Application extends Controller {
  static Form<Task> taskForm = form(Task.class); 
  
  public static Result index() {
    return redirect(routes.Application.tasks());
  }
  
  public static Result tasks() {
    return ok(
      views.html.index.render(Task.all(), taskForm)
    );
  }
  
  public static Result newTask() {
    Form<Task> filledForm = taskForm.bindFromRequest();
      if(filledForm.hasErrors()) {
        return badRequest(
          views.html.index.render(Task.all(), filledForm)
        );
      } else {
        Task.create(filledForm.get());
        return redirect(routes.Application.tasks());  
      }
  }
  
  public static Result deleteTask(Long id) {
    Task.delete(id);
    return redirect(routes.Application.tasks());
  }
  
}
