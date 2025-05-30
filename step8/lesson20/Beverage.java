public abstract class Beverage {
    // テンプレートメソッド（共通の作成手順）(きょうつう の さくせい てじゅん)
    public final void prepareRecipe() {
        boilWater(); // お湯を沸かす (おゆ を わかす)
        brew(); // 抽出 (ちゅうしゅつ)
        pourInCup(); // カップに注ぐ (かっぷ に そそぐ)
        addCondiments(); // 調味料を加える (ちょうみりょう を くわえる)
        if (isIced()) { // アイスなら (あいす なら)
            addIce(); // 氷を追加 (こおり を ついか)
        }
        addToppings(); // トッピングを追加 (とっぴんぐ を ついか)
    }

    private void boilWater() {
        System.out.println("Boiling water...");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    protected abstract void brew(); // 飲み物ごとの抽出 (のみもの ごと の ちゅうしゅつ)
    protected abstract void addCondiments(); // 飲み物ごとの調味料 (のみもの ごと の ちょうみりょう)

    protected boolean isIced() {
        return false; // デフォルトはホット (でふぉると は ほっと)
    }

    protected void addIce() {
        System.out.println("Adding ice...");
    }

    protected void addToppings() {
        // 何もしない（デフォルト）(なに も しない)
    }
}
