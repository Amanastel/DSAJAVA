package BishopAttack;

public class BishopAttack {
    /*
    let row = rowIn;
    let col = colIn;
    let count = 0;
    for(let i=row, j=col; i>=0 && j>=0; i-- && j--){
        count+=arr[i][j];
    }
    row= rowIn+1;
    col = colIn+1;
    for(let i=row, j=col; i<n && j<m; i++ && j++){
        count+=arr[i][j]
    }
    row= rowIn-1;
    col = colIn+1;
    for(let i=row, j=col; i>=0 && j<m; i-- && j++){
        count+=arr[i][j]
    }
    row= rowIn+1;
    col = colIn-1;
    for(let i=row, j=col; i<n && j>=0; i++ && j--){
        count+=arr[i][j]
    }
    return count;
}
function bishopAttack(n,m,arr){
    let max = -Infinity;
    for(let i=0; i<n;i++){
        for(let j=0; j<m; j++){
            let res = bishopAttSolu(i,j,arr,n,m);
            if(res>max){
                max=res;
            }
        }
    }
    console.log(max);
}
function runProgram(input) {
    input=input.trim().split("\n");
    let tc = +input[0];
    let line =1;
    for(let i=0; i<tc; i++){
        let num = input[line++].trim().split(" ").map(Number);
        let n = num[0];
        let m = num[1];
        let arr = [];
        for(let j=0; j<n; j++){
            arr.push(input[line++].trim().split(" ").map(Number));
        }
        bishopAttack(n,m,arr);
    }
}

if (process.env.USER === "") {
  runProgram(``);
} else {
  process.stdin.resume();
  process.stdin.setEncoding("ascii");
  let read = "";
  process.stdin.on("data", function (input) {
    read += input;
  });
  process.stdin.on("end", function () {
    read = read.replace(/\n$/, "");
    read = read.replace(/\n$/, "");
    runProgram(read);
  });
  process.on("SIGINT", function () {
    read = read.replace(/\n$/, "");
    runProgram(read);
    process.exit(0);
  });
     */
}
