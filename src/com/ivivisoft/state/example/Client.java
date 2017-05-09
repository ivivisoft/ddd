package com.ivivisoft.state.example;

/**
 * Created by andy on 2017/5/9.
 */
public class Client {
    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for (int i = 0; i < 8; i++) {
            vm.vote("ul","A");
        }
    }
}
