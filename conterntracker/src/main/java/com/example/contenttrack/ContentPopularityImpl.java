package com.example.contenttrack;

import java.util.HashMap;
import java.util.Map;

public class ContentPopularityImpl implements ContentPopularity{

    private final Map<Integer , Integer> contentPopularity;
    
    public ContentPopularityImpl(){
        contentPopularity = new HashMap<>();
    }

    @Override
    public void increasePopularity(int contentId)
    {
        if(contentPopularity.containsKey(contentId))
        {
            contentPopularity.put(contentId, contentPopularity.get(contentId) + 1);
            System.out.println("Content popularity increased by 1");
        }
        else{
            contentPopularity.put(contentId, 1);
            System.out.println("Created new content with popularity 1");
        }
    }

    @Override
    public void decreasePopularity(int contentId)
    {
        if(contentPopularity.containsKey(contentId))
        {
            if(contentPopularity.get(contentId)>=1)
            {
                contentPopularity.put(contentId, contentPopularity.get(contentId) - 1);
                if(contentPopularity.get(contentId)==0)
                {
                    // assuming that content with popularity 0 is removed
                    contentPopularity.remove(contentId);
                    System.out.println("Content is removed");
                }
                else{
                    System.out.println("Content popularity decreased by 1");
                }
            }

        }
    }

    @Override
    public int mostPopular()
    {
        if(contentPopularity.isEmpty())
        {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int contentId = -1; 
        for(Map.Entry<Integer, Integer> entry : contentPopularity.entrySet())
        {
            if(entry.getValue() > max)
            {
                max = entry.getValue();
                contentId = entry.getKey();
            }
        }
        return contentId;
    }

    @Override
    public int getPopularity(int contentId)
    {
        if(contentPopularity.containsKey(contentId))
        {
            return contentPopularity.get(contentId);
        }
        return -1;
    }
}
