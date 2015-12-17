/*
 * Copyright 2011 France Telecom R&D Beijing Co., Ltd 北京法国电信研发中心有限公司
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.weibo.api;

import java.util.Date;

public class Status {

    /**
     * 微博ID
     */
    private Long id;

    /**
     * 微博创建时间
     */
    private Date createdAt;

    /**
     * 微博信息内容
     */
    private String text;

    /**
     * 微博来源
     */
    private String source;

    /**
     * 是否已收藏，true：是，false：否
     */
    private boolean favorited;

    /**
     * 是否被截断，true：是，false：否
     */
    private boolean truncated;

    /**
     * （暂未支持）回复ID
     */
    private String inReplyToStatusId;

    /**
     * （暂未支持）回复人UID
     */
    private String inReplyToUserId;

    /**
     * （暂未支持）回复人昵称
     */
    private String inReplyToScreenName;

    /**
     * 缩略图片地址，没有时不返回此字段
     */
    private String thumbnailPic;

    /**
     * 中等尺寸图片地址，没有时不返回此字段
     */
    private String bmiddlePic;

    /**
     * 原始图片地址，没有时不返回此字段
     */
    private String originalPic;

    private Geo geo;

    /**
     * 微博MID
     */
    private String mid;

    /**
     * 微博作者的用户信息字段
     */
    private WeiboProfile user;

    /**
     * 转发数
     */
    private int repostsCount;

    /**
     * 评论数
     */
    private int commentsCount;

    /**
     * 表态数
     */
    private int attitudesCount;
    private Status retweetedStatus;


    public Status(Long id, Date createdAt, String text, String source,
                  boolean favorited, boolean truncated, int repostsCount,
                  int commentsCount) {
        super();
        this.id = id;
        this.createdAt = createdAt;
        this.text = text;
        this.source = source;
        this.favorited = favorited;
        this.truncated = truncated;
        this.repostsCount = repostsCount;
        this.commentsCount = commentsCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    public boolean isTruncated() {
        return truncated;
    }

    public void setTruncated(boolean truncated) {
        this.truncated = truncated;
    }

    public String getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    public void setInReplyToStatusId(String inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    public String getInReplyToUserId() {
        return inReplyToUserId;
    }

    public void setInReplyToUserId(String inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    public String getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    public void setInReplyToScreenName(String inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public int getRepostsCount() {
        return repostsCount;
    }

    public void setRepostsCount(int repostsCount) {
        this.repostsCount = repostsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public WeiboProfile getUser() {
        return user;
    }

    public void setUser(WeiboProfile user) {
        this.user = user;
    }

    public Status getRetweetedStatus() {
        return retweetedStatus;
    }

    public void setRetweetedStatus(Status retweetedStatus) {
        this.retweetedStatus = retweetedStatus;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }


    public String getThumbnailPic() {
        return thumbnailPic;
    }

    public void setThumbnailPic(String thumbnailPic) {
        this.thumbnailPic = thumbnailPic;
    }

    public String getBmiddlePic() {
        return bmiddlePic;
    }

    public void setBmiddlePic(String bmiddlePic) {
        this.bmiddlePic = bmiddlePic;
    }

    public String getOriginalPic() {
        return originalPic;
    }

    public void setOriginalPic(String originalPic) {
        this.originalPic = originalPic;
    }

    public int getAttitudesCount() {
        return attitudesCount;
    }

    public void setAttitudesCount(int attitudesCount) {
        this.attitudesCount = attitudesCount;
    }
}
