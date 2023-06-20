#include <stdio.h> 
#include <string.h> 

#define MAX_CHAR 1000
  
int main() 
{ 
    char str[MAX_CHAR], ch; 
    int n, count; 
  
    printf("Enter the string: \n"); 
    gets(str); 
  
    printf("Enter the character to be counted: \n"); 
    scanf("%c", &ch); 
  
    n = strlen(str); 
  
    // Initialize count 
    count = 0; 
  
    // Count the character in the string 
    for (int i = 0; i < n; i++) 
    { 
        // Increment count 
        if (str[i] == ch) 
            count++; 
    } 
  
    printf("Occurence of '%c' in '%s' = %d\n", ch, str, count); 
  
    return 0; 
} 
  
/* Hearty Harvest */
#include <stdio.h>
#include <stdlib.h> 
#include <time.h> 

// defining maximum rows and columns 
#define MAX_ROWS 3 
#define MAX_COLS 3 

// defining the structure 
struct harvest 
{ 
    int arr[MAX_ROWS][MAX_COLS]; 
    int rows, cols; 
}; 

// function to display the array elements 
void display(struct harvest h) 
{ 
    int i, j; 
    for (i = 0; i < h.rows; i++) 
    { 
        for (j = 0; j < h.cols; j++) 
        { 
            printf("%-4d", h.arr[i][j]); 
        } 
        printf("\n"); 
    } 
} 

// function to fill the array elements with values
void fillArray(struct harvest * h) 
{ 
    int i, j; 
    for (i = 0; i < h->rows; i++) 
    { 
        for (j = 0; j < h->cols; j++) 
        { 
            h->arr[i][j] = rand() % 10; 
        } 
    } 
} 

// Driver code 
int main() 
{ 
    // seed for random values 
    srand(time(NULL)); 
  
    // Creating a structure 
    struct harvest h; 
  
    // Assign rows and columns 
    h.rows = MAX_ROWS; 
    h.cols = MAX_COLS; 
  
    // Fills the array with random values 
    fillArray(&h); 
  
    // prints the array 
    display(h); 
  
    return 0; 
}