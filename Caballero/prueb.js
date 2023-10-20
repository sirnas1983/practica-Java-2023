function occurrences(list, num){
   return length(list.filter( i => i === num))
}

print(occurrences([1,2,3,3,4,5,6,6], 6))