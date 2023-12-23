 int countOccurence(int arr[], int n, int k) {
        // Your code here
        unordered_map<int,int> mapp;
        for(int i =0;i<n;i++){
            mapp[arr[i]]++;
        }
        int minFreq=n/k;
        int count =0;
        for(auto x : mapp){
            if(x.second>minFreq)
                count++;
        }
        return count;
    }
