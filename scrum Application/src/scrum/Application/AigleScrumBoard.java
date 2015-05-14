package scrum.Application;

public class AigleScrumBoard {
	private Story story;
	Main main = new Main();

	public AigleScrumBoard() {
		this.story = new Story();
		String id = main.readStoryID();
		story.setId(id);
		String description = main.readStoryDescription();
		story.setDescription(description);

	}

	public String getId() {
		return story.getId();

	}

	public String getDescription() {
		return story.getDescription();
	}

}
