/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miningtest;

/**
 *
 * @author Thomas
 */
public class Coins {
String name;
int id;
String tag;
String algorithm;
float block_time;
float block_reward;
float block_reward24;
int last_block;
float difficulty;
float difficulty24;
int nethash;
float exchange_rate;
float exchange_rate24;
float exchange_rate_vol;
String exchange_rate_curr;
String market_cap;
float estimated_rewards;
float estimated_rewards24;
float btc_revenue;
float btc_revenue24;
int profitability;
int profitability24;
long timestamp;
boolean minerDispo;
Miner miner;
float balance_confirmed;
float balance_unconfirmed;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Miner getMiner() {
        return miner;
    }

    public void setMiner(Miner miner) {
        this.miner = miner;
        
    }
    public boolean isMinerDispo() {
        return minerDispo;
    }

    public void setMinerDispo(boolean minerDispo) {
        this.minerDispo = minerDispo;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public float getBalance_confirmed() {
        return balance_confirmed;
    }

    public void setBalance_confirmed(float balance_confirmed) {
        this.balance_confirmed = balance_confirmed;
    }

    public float getBalance_unconfirmed() {
        return balance_unconfirmed;
    }

    public void setBalance_unconfirmed(float balance_unconfirmed) {
        this.balance_unconfirmed = balance_unconfirmed;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public float getBlock_time() {
        return block_time;
    }

    public void setBlock_time(float block_time) {
        this.block_time = block_time;
    }

    public float getBlock_reward() {
        return block_reward;
    }

    public void setBlock_reward(float block_reward) {
        this.block_reward = block_reward;
    }

    public float getBlock_reward24() {
        return block_reward24;
    }

    public void setBlock_reward24(float block_reward24) {
        this.block_reward24 = block_reward24;
    }

    public int getLast_block() {
        return last_block;
    }

    public void setLast_block(int last_block) {
        this.last_block = last_block;
    }

    public float getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(float difficulty) {
        this.difficulty = difficulty;
    }

    public float getDifficulty24() {
        return difficulty24;
    }

    public void setDifficulty24(float difficulty24) {
        this.difficulty24 = difficulty24;
    }

    public int getNethash() {
        return nethash;
    }

    public void setNethash(int nethash) {
        this.nethash = nethash;
    }

    public float getExchange_rate() {
        return exchange_rate;
    }

    public void setExchange_rate(float exchange_rate) {
        this.exchange_rate = exchange_rate;
    }

    public float getExchange_rate24() {
        return exchange_rate24;
    }

    public void setExchange_rate24(float exchange_rate24) {
        this.exchange_rate24 = exchange_rate24;
    }

    public float getExchange_rate_vol() {
        return exchange_rate_vol;
    }

    public void setExchange_rate_vol(float exchange_rate_vol) {
        this.exchange_rate_vol = exchange_rate_vol;
    }

    public String getExchange_rate_curr() {
        return exchange_rate_curr;
    }

    public void setExchange_rate_curr(String exchange_rate_curr) {
        this.exchange_rate_curr = exchange_rate_curr;
    }

    public String getMarket_cap() {
        return market_cap;
    }

    public void setMarket_cap(String market_cap) {
        this.market_cap = market_cap;
    }

    public float getEstimated_rewards() {
        return estimated_rewards;
    }

    public void setEstimated_rewards(float estimated_rewards) {
        this.estimated_rewards = estimated_rewards;
    }

    public float getEstimated_rewards24() {
        return estimated_rewards24;
    }

    public void setEstimated_rewards24(float estimated_rewards24) {
        this.estimated_rewards24 = estimated_rewards24;
    }

    public float getBtc_revenue() {
        return btc_revenue;
    }

    public void setBtc_revenue(float btc_revenue) {
        this.btc_revenue = btc_revenue;
    }

    public float getBtc_revenue24() {
        return btc_revenue24;
    }

    public void setBtc_revenue24(float btc_revenue24) {
        this.btc_revenue24 = btc_revenue24;
    }

    public int getProfitability() {
        return profitability;
    }

    public void setProfitability(int profitability) {
        this.profitability = profitability;
    }

    public int getProfitability24() {
        return profitability24;
    }

    public void setProfitability24(int profitability24) {
        this.profitability24 = profitability24;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
    
    public void test() {
        System.out.println("fuck");
    }
    
    public Coins(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "" + "name=" + name + ", id=" + id + ", tag=" + tag + ", algorithm=" + algorithm + ", block_time=" + block_time + ", block_reward=" + block_reward + ", block_reward24=" + block_reward24 + ", last_block=" + last_block + ", difficulty=" + difficulty + ", difficulty24=" + difficulty24 + ", nethash=" + nethash + ", exchange_rate=" + exchange_rate + ", exchange_rate24=" + exchange_rate24 + ", exchange_rate_vol=" + exchange_rate_vol + ", exchange_rate_curr=" + exchange_rate_curr + ", market_cap=" + market_cap + ", estimated_rewards=" + estimated_rewards + ", estimated_rewards24=" + estimated_rewards24 + ", btc_revenue=" + btc_revenue + ", btc_revenue24=" + btc_revenue24 + ", profitability=" + profitability + ", profitability24=" + profitability24 + ", timestamp=" + timestamp + ", minerDispo=" + minerDispo + ", miner=" + miner + '}';
    }



}
