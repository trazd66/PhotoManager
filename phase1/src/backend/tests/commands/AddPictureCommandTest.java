package backend.tests.commands;

import backend.commands.AddPictureCommand;
import backend.models.Picture;
import backend.models.PictureManager;

class AddPictureCommandTest {

  private final String picturePath = "C:\\Users\\Emilio K\\Desktop\\FileManagerTestCases\\deleteFile\\chick @Chicken.jpg";

  @org.junit.jupiter.api.Test
  void undo() {
    Picture picture = new Picture(picturePath);
    PictureManager manager = new PictureManager();
    AddPictureCommand command = new AddPictureCommand(picture, manager);
    command.execute();
    command.undo();

    assert(manager.getPictures().size() == 0);
  }

  @org.junit.jupiter.api.Test
  void execute() {
    Picture picture = new Picture(picturePath);
    PictureManager manager = new PictureManager();
    AddPictureCommand command = new AddPictureCommand(picture, manager);
    command.execute();

    assert(manager.getPictures().size() == 1);
  }
}