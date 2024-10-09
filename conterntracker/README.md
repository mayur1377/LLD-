Implement a system to track the popularity of content based on user interactions (thumbs up or thumbs down). Your task is to design an interface called ContentPopularity with the following methods:

1. increasePopularity(contentId: int) -> None: Increases the popularity of the specified content ID by one (representing a thumbs up).

2. decreasePopularity(contentId: int) -> None: Decreases the popularity of the specified content ID by one (representing a thumbs down). 

3. mostPopular() -> int: Returns the content ID with the highest popularity. If there are ties, return any one of them. -1 if no content.