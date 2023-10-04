package controllers

import baseSpec.BaseSpecWithApplication
import play.api.http.Status
import play.api.test.FakeRequest
import play.api.test.Helpers.{defaultAwaitTimeout, status}

class GitControllerSpec extends BaseSpecWithApplication {

  val TestGitController = new GitController(component)

  "GitController .index()" should {

    val result = TestGitController.index()(FakeRequest())

    "return TODO" in {
      status(result) shouldBe Status.NOT_IMPLEMENTED
    }

  }

  "GitController .read()" should {
    val result = TestGitController.read()(FakeRequest())

    "return TODO" in {
      status(result) shouldBe Status.NOT_IMPLEMENTED
    }

  }

  "GitController .create()" should {
    val result = TestGitController.create()(FakeRequest())

    "return TODO" in {
      status(result) shouldBe Status.NOT_IMPLEMENTED
    }

  }

  "GitController .update()" should {
    val result = TestGitController.update()(FakeRequest())

    "return TODO" in {
      status(result) shouldBe Status.NOT_IMPLEMENTED
    }

  }

  "GitController .delete()" should {
    val result = TestGitController.delete()(FakeRequest())

    "return TODO" in {
      status(result) shouldBe Status.NOT_IMPLEMENTED
    }

  }
}
