package controllers

import com.google.inject.Singleton
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}

import javax.inject.Inject

@Singleton
class GitController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index(): Action[AnyContent] = TODO

  def create(): Action[AnyContent] = TODO

  def read(): Action[AnyContent] = TODO

  def update(): Action[AnyContent] = TODO

  def delete(): Action[AnyContent] = TODO
}
