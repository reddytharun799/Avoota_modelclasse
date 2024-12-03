package com.neoteric.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class SearchQuery {

    private Date checkinDate;
    private Date checkoutDate;
    private List<RoomInfo> roomInfo;
    private SearchCriteria searchCriteria;
    private SearchPreferences searchPreferences;
    private String searchId;
    private boolean isSearchCompleted;
    private Map<String, Object> miscInfo;
}
