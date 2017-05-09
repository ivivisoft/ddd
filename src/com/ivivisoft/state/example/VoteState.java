package com.ivivisoft.state.example;

/**
 * Created by andy on 2017/5/8.
 */
public interface VoteState {
    void vote(String user,String voteItem,VoteManager voteManager);
}
