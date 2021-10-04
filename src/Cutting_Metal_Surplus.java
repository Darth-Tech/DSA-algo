/*
Question link: https://www.lintcode.com/problem/1917/
Language used: Java 7/8
*/

static int maxProfit(int costPerCut, int salePrice, List<Integer> lengths) 
{

int maxLength = 0;
for (int length : lengths)
{
if (length > maxLength) 
{
maxLength = length;
}
}

int maxProfit = 0;
for (int i = 1; i < maxLength; i++) {

int sumOfLengths = 0;
int sumOfCutCounts = 0;
int sumOfCutWastes = 0;
for (int length : lengths) 
{
sumOfLengths += length;
if (length % i == 0) 
{
sumOfCutCounts += (length/i - 1);
}
else {
sumOfCutCounts += (length/i);
}
sumOfCutWastes += (length%i);
}

int profit = sumOfLengths*salePrice - sumOfCutCounts*costPerCut - sumOfCutWastes*salePrice;
if (profit > maxProfit) {
maxProfit = profit;
}
}
return maxProfit;
}

