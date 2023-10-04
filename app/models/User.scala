package models

import play.api.libs.json.{Json, OFormat}

case class User(
               username: String,
               accountCreatedAt: String,
               location: String,
               numberOfFollowers: Int,
               numberFollowing: Int
               )

object User{
  implicit val formats: OFormat[User] = Json.format[User]
}