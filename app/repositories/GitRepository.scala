package repositories

import com.google.inject.Singleton
import models.User
import org.mongodb.scala.model.{IndexModel, Indexes}
import play.api.mvc.ControllerHelpers.TODO
import play.api.mvc.{Action, AnyContent}
import uk.gov.hmrc.mongo.MongoComponent
import uk.gov.hmrc.mongo.play.json.PlayMongoRepository

import javax.inject.Inject
import scala.concurrent.ExecutionContext

@Singleton
class GitRepository @Inject()(mongoComponent: MongoComponent)(implicit ec: ExecutionContext) extends PlayMongoRepository[User](
  collectionName = "UserModels",
  mongoComponent = mongoComponent,
  domainFormat = User.formats,
  indexes = Seq(IndexModel(
    Indexes.ascending("username")
  )),
  replaceIndexes = false
) {

  def index(): Action[AnyContent] = TODO

  def create(): Action[AnyContent] = TODO

  def read(): Action[AnyContent] = TODO

  def update(): Action[AnyContent] = TODO

  def delete(): Action[AnyContent] =  TODO
}
